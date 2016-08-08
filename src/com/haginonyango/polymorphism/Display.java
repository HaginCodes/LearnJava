package com.haginonyango.polymorphism;

public class Display {

	public static void main(String[] args) {
		
	
		Person Hagin = new Person();
		Food fo = new Food();
		Food po = new Donut();
		
		
		Hagin.digest(fo);
		Hagin.digest(po);

		
		
		/*	Food hagin[]= new Food[2];
		hagin[0]=new Apple();
		hagin[1]=new Donut();
		
		for(int x=0;x<2;x++){
			hagin[x].eat();
		}*/

	}

}
