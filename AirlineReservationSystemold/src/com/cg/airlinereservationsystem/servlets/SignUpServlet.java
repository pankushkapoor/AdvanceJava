package com.cg.airlinereservationsystem.servlets;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.airlinereservationsystem.beans.Users;
import com.cg.airlinereservationsystem.service.AirlineServices;
import com.cg.airlinereservationsystem.service.AirlineServicesImpl;
import com.cg.airlinereservationsystem.util.EntityManagerFactoryProvider;


@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 13333L;
       AirlineServices services = new AirlineServicesImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String mobileNo = request.getParameter("mobileNo");
		String role = request.getParameter("role");
		String userName = services.acceptDetails(username, password, role, Integer.parseInt(mobileNo));
		System.out.println(userName);
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("homePage.jsp");
		request.setAttribute("userName", userName);
		dispatcher.forward(request, response);
	}

}
