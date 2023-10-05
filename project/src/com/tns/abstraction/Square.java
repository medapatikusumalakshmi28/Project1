package com.tns.abstraction;

public class Square extends Shape {
	private float side;
	public Square() {
		super();
		this.side=2.0f;
	}
	public Square(float side){
		super();
		this.side=side;	
	}
	void calArea() {
		//TODO Auto-generated method stub
		super.area=side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}
