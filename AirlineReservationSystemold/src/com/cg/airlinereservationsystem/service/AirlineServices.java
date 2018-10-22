package com.cg.airlinereservationsystem.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.airlinereservationsystem.beans.BookingInformation;
import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.beans.Users;

public interface AirlineServices {
	String acceptDetails( String username,String password,String role, long mobileNo);
	Users find(String username,String password);
	ArrayList<FlightInformation> flightdetails(String destCity,String arrCity);
	int bookFlight(BookingInformation bookingInformation);
	FlightInformation findOne(String flightNo);
	BookingInformation viewReservationDetails(int bookingId);
	boolean updateDetails(BookingInformation bookingInformation);
	void cancelReservation(int bookingId);
}
