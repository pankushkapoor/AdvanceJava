package com.cg.demo.webservices;

import javax.jws.WebService;

@WebService(endpointInterface="com.cg.demo.webservices.CalculatorServer")
public class Calculator implements CalculatorServer{

	@Override
	public int addition(int param1, int param2) {
		return param1 + param2;
	}

	@Override
	public int subtraction(int param1, int param2) {
		return param1 - param2;
	}

	@Override
	public int multiplication(int param1, int param2) {
		return param1 * param2;
	}

	@Override
	public int division(int param1, int param2) {
		return param1 / param2;
	}

	@Override
	public int modulus(int param1, int param2) {
		return param1 % param2;
	}

}
