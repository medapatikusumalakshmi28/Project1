package com.tns.lambda;

public class Withparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c =(a)->{return a*a*a;};
		System.out.println(c.calculate(6));

	}

}
