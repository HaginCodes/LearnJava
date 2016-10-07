package com.haginonyango.holdingobjects;

public class Display {

	public static void main(String[] args) {

	Animals[] thelist = new Animals[2];
	
	Dog d = new Dog();
	Cat c = new Cat();
	
	thelist[0]=d;
	thelist[1]=c;
	
	for(Animals x: thelist){
		x.noise();
	}
	}
	
}
