package com.cg.airlinereservationsystem.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FlightInformation {
	@Id
	private String flightNo;
	private String airline,depCity,arrCity;
	private String depDate,arrDate;
	private String depTime,arrTime;
	private int firstSeats;
	private float firstSeatFare;
	private int bussSeats;
	private float bussSeatsFare;
	
	public FlightInformation(String flightNo, String airline, String depCity,
			String arrCity, String depDate, String  arrDate, String depTime,
			String arrTime, int firstSeats, float firstSeatFare, int bussSeats,
			float bussSeatsFare) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.depCity = depCity;
		this.arrCity = arrCity;
		this.depDate =  depDate;
		this.arrDate = arrDate;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.firstSeats = firstSeats;
		this.firstSeatFare = firstSeatFare;
		this.bussSeats = bussSeats;
		this.bussSeatsFare = bussSeatsFare;
	}
	public FlightInformation() {
		super();
	}
	@Override
	public String toString() {
		return "FlightInformation [flightNo=" + flightNo + ", airline="
				+ airline + ", depCity=" + depCity + ", arrCity=" + arrCity
				+ ", depDate=" + depDate + ", arrDate=" + arrDate
				+ ", depTime=" + depTime + ", arrTime=" + arrTime
				+ ", firstSeats=" + firstSeats + ", firstSeatFare="
				+ firstSeatFare + ", bussSeats=" + bussSeats
				+ ", bussSeatsFare=" + bussSeatsFare + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
		result = prime * result + ((arrCity == null) ? 0 : arrCity.hashCode());
		result = prime * result + ((arrDate == null) ? 0 : arrDate.hashCode());
		result = prime * result + ((arrTime == null) ? 0 : arrTime.hashCode());
		result = prime * result + bussSeats;
		result = prime * result + Float.floatToIntBits(bussSeatsFare);
		result = prime * result + ((depCity == null) ? 0 : depCity.hashCode());
		result = prime * result + ((depDate == null) ? 0 : depDate.hashCode());
		result = prime * result + ((depTime == null) ? 0 : depTime.hashCode());
		result = prime * result + Float.floatToIntBits(firstSeatFare);
		result = prime * result + firstSeats;
		result = prime * result
				+ ((flightNo == null) ? 0 : flightNo.hashCode());
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
		FlightInformation other = (FlightInformation) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		if (arrCity == null) {
			if (other.arrCity != null)
				return false;
		} else if (!arrCity.equals(other.arrCity))
			return false;
		if (arrDate == null) {
			if (other.arrDate != null)
				return false;
		} else if (!arrDate.equals(other.arrDate))
			return false;
		if (arrTime == null) {
			if (other.arrTime != null)
				return false;
		} else if (!arrTime.equals(other.arrTime))
			return false;
		if (bussSeats != other.bussSeats)
			return false;
		if (Float.floatToIntBits(bussSeatsFare) != Float
				.floatToIntBits(other.bussSeatsFare))
			return false;
		if (depCity == null) {
			if (other.depCity != null)
				return false;
		} else if (!depCity.equals(other.depCity))
			return false;
		if (depDate == null) {
			if (other.depDate != null)
				return false;
		} else if (!depDate.equals(other.depDate))
			return false;
		if (depTime == null) {
			if (other.depTime != null)
				return false;
		} else if (!depTime.equals(other.depTime))
			return false;
		if (Float.floatToIntBits(firstSeatFare) != Float
				.floatToIntBits(other.firstSeatFare))
			return false;
		if (firstSeats != other.firstSeats)
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		return true;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public String getDepDate() {
		return depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}
	public String getArrDate() {
		return arrDate;
	}
	public void setArrDate(String arrDate) {
		this.arrDate = arrDate;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public int getFirstSeats() {
		return firstSeats;
	}
	public void setFirstSeats(int firstSeats) {
		this.firstSeats = firstSeats;
	}
	public float getFirstSeatFare() {
		return firstSeatFare;
	}
	public void setFirstSeatFare(float firstSeatFare) {
		this.firstSeatFare = firstSeatFare;
	}
	public int getBussSeats() {
		return bussSeats;
	}
	public void setBussSeats(int bussSeats) {
		this.bussSeats = bussSeats;
	}
	public float getBussSeatsFare() {
		return bussSeatsFare;
	}
	public void setBussSeatsFare(float bussSeatsFare) {
		this.bussSeatsFare = bussSeatsFare;
	}
}
