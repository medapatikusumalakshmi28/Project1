package com.tns.overload;

public class OverLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Sphere s=new Sphere();
		   System.out.println(s.Volume(6));
		   System.out.println(s.Volume(6.6f));
		   System.out.println(s.Volume(6.2f,3.4f,7.8f));
	}

}
