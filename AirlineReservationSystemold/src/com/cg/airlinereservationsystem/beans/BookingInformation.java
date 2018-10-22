package com.cg.airlinereservationsystem.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@SequenceGenerator(name="booking_counter",initialValue=101,allocationSize=1)
@Entity
public class BookingInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="booking_counter")
	private int bookingId;
	private String custEmail;
	private int noOfPassengers;
	private String classType;
	private float totalFare;
	private int seatNumber;
	@OneToOne
	private FlightInformation flightInformation;
	public BookingInformation(String custEmail, int noOfPassengers,
			String classType, float totalFare, int seatNumber,
			FlightInformation flightInformation) {
		super();
		this.custEmail = custEmail;
		this.noOfPassengers = noOfPassengers;
		this.classType = classType;
		this.totalFare = totalFare;
		this.seatNumber = seatNumber;
		this.flightInformation = flightInformation;
	}
	public BookingInformation(int bookingId, String custEmail,
			int noOfPassengers, String classType, float totalFare,
			int seatNumber, FlightInformation flightInformation) {
		super();
		this.bookingId = bookingId;
		this.custEmail = custEmail;
		this.noOfPassengers = noOfPassengers;
		this.classType = classType;
		this.totalFare = totalFare;
		this.seatNumber = seatNumber;
		this.flightInformation = flightInformation;
	}
	
	public BookingInformation(String custEmail, int noOfPassengers,
			String classType, FlightInformation flightInformation) {
		super();
		this.custEmail = custEmail;
		this.noOfPassengers = noOfPassengers;
		this.classType = classType;
		this.flightInformation = flightInformation;
		if(this.classType.equals("First Class"))
			this.totalFare = noOfPassengers*6500;
		else 
			this.totalFare = noOfPassengers*4500;
	}
	public BookingInformation() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingId;
		result = prime * result
				+ ((classType == null) ? 0 : classType.hashCode());
		result = prime * result
				+ ((custEmail == null) ? 0 : custEmail.hashCode());
		result = prime
				* result
				+ ((flightInformation == null) ? 0 : flightInformation
						.hashCode());
		result = prime * result + noOfPassengers;
		result = prime * result + seatNumber;
		result = prime * result + Float.floatToIntBits(totalFare);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingInformation other = (BookingInformation) obj;
		if (bookingId != other.bookingId)
			return false;
		if (classType == null) {
			if (other.classType != null)
				return false;
		} else if (!classType.equals(other.classType))
			return false;
		if (custEmail == null) {
			if (other.custEmail != null)
				return false;
		} else if (!custEmail.equals(other.custEmail))
			return false;
		if (flightInformation == null) {
			if (other.flightInformation != null)
				return false;
		} else if (!flightInformation.equals(other.flightInformation))
			return false;
		if (noOfPassengers != other.noOfPassengers)
			return false;
		if (seatNumber != other.seatNumber)
			return false;
		if (Float.floatToIntBits(totalFare) != Float
				.floatToIntBits(other.totalFare))
			return false;
		return true;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public float getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(float totalFare) {
			this.totalFare = totalFare;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public FlightInformation getFlightInformation() {
		return flightInformation;
	}
	public void setFlightInformation(FlightInformation flightInformation) {
		this.flightInformation = flightInformation;
	}
	@Override
	public String toString() {
		return "BookingInformation [bookingId=" + bookingId + ", custEmail="
				+ custEmail + ", noOfPassengers=" + noOfPassengers
				+ ", classType=" + classType + ", totalFare=" + totalFare
				+ ", seatNumber=" + seatNumber + ", flightInformation="
				+ flightInformation + "]";
	}	
	
}
