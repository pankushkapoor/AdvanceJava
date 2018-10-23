package com.cg.demo.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cg.demo.webservices.CalculatorServer;

public class Client {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:1111/cs?wsdl"); // url where the service is running
		
		//Qualified name of the service
		//1st argument is the service URI
		//2nd argument is the service name in the WSDL
		QName qname = new QName("http://webservices.demo.cg.com/","CalculatorService"); //implementer class name + service
		
		//Create, in effect, a factory for the service.
		Service service= Service.create(url,qname);
		
		//Extract the endpoint interface, the service "port"
		CalculatorServer endPointInterface = service.getPort(CalculatorServer.class); //we need a dummy/replica(same methods that we have in interface) class which will provide(getPort will provide) the implementation of calculatorserver interface
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number for calculator operations");
		int param1 = scanner.nextInt();
		System.out.println("Enter 1st number for calculator operations");
		int param2 = scanner.nextInt();
		
		System.out.println("Addition: " + endPointInterface.addition(param1, param2)); // we calling proxy methods- dummy/ calling the local method
		System.out.println("Subtraction: " + endPointInterface.subtraction(param1, param2));
		System.out.println("Multiplication: " + endPointInterface.multiplication(param1, param2));
		System.out.println("Division: " + endPointInterface.division(param1, param2));
		System.out.println("Modulus: " + endPointInterface.modulus(param1, param2));
	}

}
