package com.ananie.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ananie.Model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Product> productList = new ArrayList<Product>();
	private int currentId = 1;
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
		// receive input and create a new product; we start by getting parameter values from the user
		String name=req.getParameter("product");
		double price= Double.parseDouble(req.getParameter("price"));
		// we add them to a List for storing them in the program for now
		productList.add(new Product(currentId++,price,name));
		// we send the message to the user that the product was added
		req.setAttribute("message","Product added succesfully");
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}
	// this is GET end point, it returns a product list to the user
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp ) throws IOException,ServletException{
		req.setAttribute("products", productList);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
	}

}
