package com.cg.demo.main;

import javax.xml.ws.Endpoint;

import com.cg.demo.webservices.Calculator;

public class CalculatorPublisher {

	public static void main(String[] args) {
		//1st argument is the publication URL
		//2nd argument is an SIB Instance
		Endpoint.publish("http://127.0.0.1:1111/cs", new Calculator());
		System.out.println("Server has started");

	}

}
