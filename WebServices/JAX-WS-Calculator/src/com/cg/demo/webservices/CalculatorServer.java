package com.cg.demo.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style=Style.RPC)
public interface CalculatorServer {
	@WebMethod
	int addition(int param1, int param2);
	
	@WebMethod
	int subtraction(int param1, int param2);
	
	@WebMethod
	int multiplication(int param1, int param2);
	
	@WebMethod
	int division(int param1, int param2);
	
	@WebMethod
	int modulus(int param1, int param2);
}
