package com.haginonyango.timeclass;

public class TimeClass {

	public static void main(String[] args) {
		TimeComponents timeObject = new TimeComponents();
	
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		timeObject.setTime(13, 27, 6);
		
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
	}

}
