package com.haginonyango.multiple.constructors;

import java.util.concurrent.SynchronousQueue;

public class DisplayTime {

	public static void main(String[] args){
		
		//objects uses constructors with same amount of parameters
		TimeUtils timeObject = new TimeUtils();
		TimeUtils timeObject2 = new TimeUtils(5);
		TimeUtils timeObject3 = new TimeUtils(5,13);
		TimeUtils timeObject4 = new TimeUtils(5,12,43);
		
		System.out.printf("%s\n", timeObject.toMilitary());
		System.out.printf("%s\n", timeObject2.toMilitary());
		System.out.printf("%s\n", timeObject3.toMilitary());
		System.out.printf("%s\n", timeObject4.toMilitary());
		
	}
}
