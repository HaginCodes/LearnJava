package com.haginonyango.holdingobjects;

public class AnimalList {

	private Animals[] thelist = new Animals[5];
	private int i = 0;
	
	
	public void add(Animals a){
		if(i<thelist.length){
			thelist[i]=a;
			System.out.println("Animal added at index "+i);
			i++;
		}
	}
}
