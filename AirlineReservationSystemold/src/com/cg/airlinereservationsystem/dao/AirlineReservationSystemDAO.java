package com.cg.airlinereservationsystem.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.airlinereservationsystem.beans.BookingInformation;
import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.beans.Users;

public interface AirlineReservationSystemDAO {
	Users findUser(String username);
	Users userVerification(String username,String password);
	Users saveUser(Users user);
	
	FlightInformation saveFlights(FlightInformation flightInformation);
	ArrayList<FlightInformation> filterFlights(String depCity,String arrCity);
	FlightInformation findOneFlight(String flightNo);
	
	BookingInformation getReservationDetails(String bookingId);
	//ArrayList<BookingInformation> getAllreservationDetails();
	int bookTicket(BookingInformation bookingInformation);	
	BookingInformation getBookingInformation(int bookingId);
	
	boolean update(BookingInformation bookingInformation);
	void deleteReservation(int bookingId);
}