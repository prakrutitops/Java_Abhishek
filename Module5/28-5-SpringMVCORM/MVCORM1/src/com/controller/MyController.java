package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import com.bo.Mybo;
import com.model.Person;

@Controller
public class MyController 
{
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert")
	public String insert(HttpServletRequest req, HttpServletResponse resp,ModelMap map)
	{
		Person p = new Person();
		p.setName(req.getParameter("name"));
		p.setAddress(req.getParameter("address"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Mybo bo = (Mybo) acm.getBean("bo");
		bo.insertdata(p);
		return "show";
	}
	@RequestMapping(value="/show")
	public String show()
	{
		return "show";
	}
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest req, HttpServletResponse resp,ModelMap map)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Mybo bo = (Mybo) acm.getBean("bo");
		bo.deletedata(id);
		return "show";
	}
	
	
}
