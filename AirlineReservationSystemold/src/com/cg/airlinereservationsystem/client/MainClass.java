package com.cg.airlinereservationsystem.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.cg.airlinereservationsystem.beans.BookingInformation;
import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.beans.Users;
import com.cg.airlinereservationsystem.dao.AirlineReservationSystemDAO;
import com.cg.airlinereservationsystem.dao.AirlineReservationSystemDAOImpl;
import com.cg.airlinereservationsystem.service.AirlineServices;
import com.cg.airlinereservationsystem.service.AirlineServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		AirlineServices as = new AirlineServicesImpl();
		System.out.println(as.acceptDetails("Abhi", "12345", "adm", 53289149));
		//System.out.println(as.find("Abhi", "12345"));
		System.out.println(as.flightdetails("Pune", "Delhi"));
		//System.out.println(as.bookFlight(new BookingInformation("abhi", 1, "First", 1*6500, 1,as.findOne("1001"))));
		//System.out.println(as.viewReservationDetails(101));	
		BookingInformation bookingInformation = new BookingInformation("abhi", 1, "First", 1*6500, 1,as.findOne("1001"));
		bookingInformation.setCustEmail("Abhishek");
		as.updateDetails(bookingInformation);
		System.out.println(as.viewReservationDetails(101));
		as.cancelReservation(101);
		
	}

}
