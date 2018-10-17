package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/SignupServlet")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public RegisterUser() {
	}   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//USING JSP
		int associateId = Integer.parseInt(request.getParameter("associateId"));
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String []hobbies = request.getParameterValues("hobbies");
		String birthDate = request.getParameter("birthDate");
		Associate associate = new Associate(associateId, userName, firstName, lastName, email, birthDate, password, hobbies);
		RequestDispatcher dispatcher;
		//if(associate.getUserName().equals("pankush") && associate.getPassword().equals("sasa")){
			dispatcher = request.getRequestDispatcher("signUpSuccessPage.jsp");
			request.setAttribute("associate", associate);
			dispatcher.forward(request, response);
		//}
		/*else{
			dispatcher = request.getRequestDispatcher("loginSuccessPage.jsp");
			request.setAttribute("errorMessage", "AssociateId or Password is incorrect! :/");
			dispatcher.forward(request, response);
		}*/
		
		
		
		//USING HTML
		/*String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String email = request.getParameter("email");
		String []hobbies = request.getParameterValues("hobbies");
		String birthDate = request.getParameter("birthDate");
		PrintWriter out = response.getWriter();
		out.print("<html><body><div align='center'>");
		out.println("<font color='red' size='8'> Welcome " + firstName + " " + lastName + "</font><br>" );
		out.print("<font size='6'>Hobbies: </font>");
		for (String hob : hobbies) {
			out.println("<font size='6'>" + hob + "</font>");
		}
		out.println("<br><font size='6'> Let me guess. Your Birthdate is " + birthDate + "</font>");
		out.print("</div></body></html>");*/
	}
}