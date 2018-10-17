package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/LoginServlet")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//USING JSP 
		//int associateId = Integer.parseInt(request.getParameter("associateId"));
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");
		//String firstName = request.getParameter("firstName");
		//String lastName = request.getParameter("lastName");
		//Associate associate1 = new Associate(associateId, password);
		//Associate associate = new Associate(userName, firstName, lastName, password);
		Associate associate = new Associate(userName, password);
		RequestDispatcher dispatcher;
		if(associate.getUserName().equals("pankush") && associate.getPassword().equals("sasa")){
			dispatcher = request.getRequestDispatcher("loginSuccessPage.jsp");
			request.setAttribute("associate", associate);
			dispatcher.forward(request, response);
		}
		else{
			//dispatcher = request.getRequestDispatcher("loginErrorPage.jsp");
			dispatcher = request.getRequestDispatcher("login.jsp"); //to display the error on the login page only below form
			request.setAttribute("errorMessage", "AssociateId or Password is incorrect! :/");
			dispatcher.forward(request, response);
		}
		
		
		
		//Using HTML FILES
		/*String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.print("<html><body><div align='center'>"); //common code for both if the password or user name is wrong/correct 
		
		if(username.equals("pankush") && password.equals("hello123"))
			out.print("<font color='green'>Welcome back "+ username + "</font>");
		else
			out.print("<font color='red'>Username or Password is Invalid :/</font>");
		
		out.print("</div></body></html>"); //common code for both if the password or user name is wrong/correct
*/	}
}
