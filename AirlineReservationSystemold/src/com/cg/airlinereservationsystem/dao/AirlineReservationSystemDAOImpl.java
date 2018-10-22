package com.cg.airlinereservationsystem.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cg.airlinereservationsystem.beans.BookingInformation;
import com.cg.airlinereservationsystem.beans.FlightInformation;
import com.cg.airlinereservationsystem.beans.Users;
import com.cg.airlinereservationsystem.util.EntityManagerFactoryProvider;


public class AirlineReservationSystemDAOImpl implements AirlineReservationSystemDAO{
	EntityManagerFactory factory = EntityManagerFactoryProvider.getEntityManagerFactory();
	@Override
	public Users findUser(String username) {
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(Users.class, username);
	}

	@Override
	public Users saveUser(Users user) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
		return user;
	}

	@Override
	public BookingInformation getReservationDetails(String bookingId) {
		return null;
	}

	@Override
	public FlightInformation saveFlights(FlightInformation flightInformation) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(flightInformation);
		entityManager.getTransaction().commit();
		entityManager.close();
		return flightInformation;
		
	}

	@Override
	public Users userVerification(String username, String password) {
		EntityManager entityManager = factory.createEntityManager();
		if((entityManager.find(Users.class, username)).getPassword().equals(password))
			return entityManager.find(Users.class, username);
		else
			return null;
	}

	@Override
	public ArrayList<FlightInformation> filterFlights(String depCity,String arrCity) {
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("select f from FlightInformation f where f.depCity=:depCity and f.arrCity=:arrCity");
		query.setParameter("depCity", depCity);
		query.setParameter("arrCity",arrCity);
		ArrayList<FlightInformation> list = (ArrayList<FlightInformation>) query.getResultList();
		return list;
	}

	@Override
	public int bookTicket(BookingInformation bookingInformation) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(bookingInformation);
		entityManager.getTransaction().commit();
		entityManager.close();
		return bookingInformation.getBookingId();
	}

	@Override
	public FlightInformation findOneFlight(String flightNo) {
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(FlightInformation.class, flightNo);
	}

	@Override
	public BookingInformation getBookingInformation(int bookingId) {
		EntityManager entityManager = factory.createEntityManager();
		return entityManager.find(BookingInformation.class, bookingId);
	}

	@Override
	public boolean update(BookingInformation bookingInformation) {
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(bookingInformation);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public void deleteReservation(int bookingId) {
		
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		BookingInformation bookingInformation = entityManager.find(BookingInformation.class, bookingId);		
		entityManager.remove(bookingInformation);
		entityManager.getTransaction().commit();
		entityManager.close();
		/*EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("delete from BookingInformation where bookingId=101");
		query.setParameter("bookingId", bookingId);
		entityManager.close();*/
	}
}
