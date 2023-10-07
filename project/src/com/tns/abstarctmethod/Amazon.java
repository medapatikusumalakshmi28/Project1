package com.tns.abstarctmethod;
import java.util.Scanner;

public class Amazon {
public static void main(String[] args) {
	int amt;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter amount");
	amt=sc.nextInt();
	Accounts a;
	a= new NonPrime(amt);
	a.deliveryCharges(amt);
}
}
