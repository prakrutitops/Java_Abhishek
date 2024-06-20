package com.example;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO 
{
    private static List<Item> items = new ArrayList<>();
    private static int nextId = 1;

    public List<Item> getAllItems() 
    {
        return items;
    }

    public Item getItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
    }

    public boolean updateItem(Item updatedItem) {
        for (Item item : items) {
            if (item.getId() == updatedItem.getId()) {
                item.setName(updatedItem.getName());
                item.setPrice(updatedItem.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }
}
