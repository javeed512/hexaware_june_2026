package com.hexaware.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondController
 */
@WebServlet("/SecondController")
public class SecondController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SecondController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		out.print("<h1>Welcome to SecondServlet</h1>");
		
			//	String name =(String)	request.getAttribute("username");
		
			/*
			 * HttpSession session = request.getSession();
			 * 
			 * String name =(String) session.getAttribute("username");
			 */
		
		ServletContext  application =		request.getServletContext();
		
		String name =(String) application.getAttribute("username");
				
			out.print("request from 1st to 2nd controller by "+name);
			
			
			//request.removeAttribute("username");
			

		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		
				rd.include(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
