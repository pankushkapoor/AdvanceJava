package com.cg.airlinereservationsystem.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

import com.cg.airlinereservationsystem.beans.BookingInformation;
import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.beans.Users;
import com.cg.airlinereservationsystem.dao.AirlineReservationSystemDAO;
import com.cg.airlinereservationsystem.dao.AirlineReservationSystemDAOImpl;

public class AirlineServicesImpl implements AirlineServices{
		private static AirlineReservationSystemDAO airlineDAO=new AirlineReservationSystemDAOImpl();
	@Override
	public String acceptDetails(String username,String password, String role, long mobileNo) {
		Users user=new Users(username, password, role, mobileNo);
		return airlineDAO.saveUser(user).getUsername();
	}
	@Override
	public Users find(String username, String password) {
		return airlineDAO.userVerification(username, password);
	}
	@Override
	public ArrayList<FlightInformation> flightdetails(String depCity, String arrCity) {
			FlightInformation f1 = new FlightInformation("1001", "Nik", "Pune", "Delhi", "21/10/2018", "21/10/2018", "15:00", "16:00", 30, 6500, 60, 4500);
			FlightInformation f2 = new FlightInformation("1002", "Abhi", "Pune", "Hyderabad", "21/10/2018", "21/10/2018", "17:00", "18:00", 30, 6500, 60, 4500);
			FlightInformation f3 = new FlightInformation("1003", "Anm", "Pune", "Bangalore","21/10/2018","21/10/2018", "5:00", "6:00", 30, 6500, 60, 4500);
			FlightInformation f4 = new FlightInformation("1004", "Nik", "Pune", "Delhi", "21/10/2018", "21/10/2018", "5:00", "6:00", 30, 6500, 60, 4500);
			airlineDAO.saveFlights(f1);
			airlineDAO.saveFlights(f2);
			airlineDAO.saveFlights(f3);
			airlineDAO.saveFlights(f4);
		return airlineDAO.filterFlights(depCity, arrCity);	
	}
	@Override
	public int bookFlight(BookingInformation bookingInformation) {
			return airlineDAO.bookTicket(bookingInformation);
	}
	@Override
	public FlightInformation findOne(String flightNo) {
		return airlineDAO.findOneFlight(flightNo);
	}
	@Override
	public BookingInformation viewReservationDetails(int bookingId) {
		return airlineDAO.getBookingInformation(bookingId);
	}
	@Override
	public boolean updateDetails(BookingInformation bookingInformation) {
		return airlineDAO.update(bookingInformation);
	}
	@Override
	public void cancelReservation(int bookingId) {
		airlineDAO.deleteReservation(bookingId);
	}

}
