package com.advice.web;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.advice.Logic;

public class Suggestions extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String range = request.getParameter("price");
		String choice = request.getParameter("category");
		
		Logic obj = new Logic();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		
		if(choice.equals("Shoes"))
		{
			list1 = obj.suggestionsForShoes(range);
		}
		else if(choice.equals("Wrist-watch"))
		{
			list2 = obj.suggestionsForWatch(range);
		}
		else if(choice.equals("Both"))
		{
			list1 = obj.suggestionsForShoes(range);
			list2 = obj.suggestionsForWatch(range);
		}
		
		request.setAttribute("fName", firstName);
		request.setAttribute("lName", lastName);
		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
		
				
	}
}