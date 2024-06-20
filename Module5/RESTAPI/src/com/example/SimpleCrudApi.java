package com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;

public class SimpleCrudApi {

    private static ItemDAO itemDAO = new ItemDAO();

    public static void main(String[] args) throws IOException 
    {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/items", new ItemsHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running on port 8080");
    }

    static class ItemsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod();

            if (method.equalsIgnoreCase("GET")) {
                handleGetRequest(exchange);
            } else if (method.equalsIgnoreCase("POST")) {
                handlePostRequest(exchange);
            } else if (method.equalsIgnoreCase("PUT")) {
                handlePutRequest(exchange);
            } else if (method.equalsIgnoreCase("DELETE")) {
                handleDeleteRequest(exchange);
            } else {
                sendResponse(exchange, 405, "Method Not Allowed");
            }
        }

        private void handleGetRequest(HttpExchange exchange) throws IOException {
            List<Item> items = itemDAO.getAllItems();
            JSONArray jsonArray = new JSONArray(items);
            sendResponse(exchange, 200, jsonArray.toString());
        }

        private void handlePostRequest(HttpExchange exchange) throws IOException {
            InputStream requestBody = exchange.getRequestBody();
            String jsonInput = inputStreamToString(requestBody);

            JSONObject jsonObject = new JSONObject(jsonInput);
            String name = jsonObject.getString("name");
            double price = jsonObject.getDouble("price");

            Item newItem = new Item(0, name, price);
            itemDAO.addItem(newItem);

            sendResponse(exchange, 201, "Item created: " + newItem.getName());
        }

        private void handlePutRequest(HttpExchange exchange) throws IOException {
            String uri = exchange.getRequestURI().toString();
            int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));

            InputStream requestBody = exchange.getRequestBody();
            String jsonInput = inputStreamToString(requestBody);

            JSONObject jsonObject = new JSONObject(jsonInput);
            String name = jsonObject.getString("name");
            double price = jsonObject.getDouble("price");

            Item updatedItem = new Item(id, name, price);
            boolean success = itemDAO.updateItem(updatedItem);

            if (success) {
                sendResponse(exchange, 200, "Item updated: " + updatedItem.getName());
            } else {
                sendResponse(exchange, 404, "Item not found");
            }
        }

        private void handleDeleteRequest(HttpExchange exchange) throws IOException {
            String uri = exchange.getRequestURI().toString();
            int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/") + 1));

            boolean success = itemDAO.deleteItem(id);

            if (success) {
                sendResponse(exchange, 200, "Item deleted");
            } else {
                sendResponse(exchange, 404, "Item not found");
            }
        }

        private void sendResponse(HttpExchange exchange, int statusCode, String response) throws IOException {
            exchange.sendResponseHeaders(statusCode, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private String inputStreamToString(InputStream inputStream) throws IOException {
            StringBuilder resultStringBuilder = new StringBuilder();
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                resultStringBuilder.append(new String(bytes, 0, length));
            }
            return resultStringBuilder.toString();
        }
    }
}
