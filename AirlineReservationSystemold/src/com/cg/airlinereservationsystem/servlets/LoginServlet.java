package com.cg.airlinereservationsystem.servlets;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.cg.airlinereservationsystem.beans.Users;
import com.cg.airlinereservationsystem.service.AirlineServices;
import com.cg.airlinereservationsystem.service.AirlineServicesImpl;
import com.cg.airlinereservationsystem.util.EntityManagerFactoryProvider;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 11111L;
	AirlineServices services = new AirlineServicesImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		Users user = new Users(username);
		if(services.find(username, password)==null){
			response.sendRedirect("indexPage.jsp");
		}
		else{
			RequestDispatcher dispatcher;
			dispatcher = request.getRequestDispatcher("homePage.jsp");
			request.setAttribute("user", user);
			dispatcher.forward(request, response);
		}
	}

}
