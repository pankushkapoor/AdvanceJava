package com.cg.airlinereservationsystem.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.service.AirlineServices;
import com.cg.airlinereservationsystem.service.AirlineServicesImpl;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 12222L;
    AirlineServices services = new AirlineServicesImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String depCity = request.getParameter("depCity");
		String arrCity = request.getParameter("arrCity");
		//String dateOfJourney = request.getParameter("dateOfJourney");
		ArrayList<FlightInformation> flist = services.flightdetails(depCity, arrCity);
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("showFlightDetailsPage.jsp");
		request.setAttribute("flist",flist);
		dispatcher.forward(request, response);
	}

}
