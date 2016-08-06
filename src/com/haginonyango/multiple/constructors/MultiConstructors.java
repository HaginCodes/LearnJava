package com.haginonyango.multiple.constructors;

public class MultiConstructors {

	private int hour;
	private int minute;
	private int second;
	
	//you can build different constructors based on 
	//on how many arguments you have
	//so you don't need the user to enter one set of instructions
	
	public MultiConstructors(){
		this(0,0,0);
	}
	public MultiConstructors(int h){
		this(h,0,0);
	}
	public MultiConstructors(int h, int m){
		this(h,m,0);
	}
	
	public MultiConstructors(int h, int m, int s){
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		hour = ((h>=0&&h<24)?h:0);
	}
	public void setMinute(int m){
		minute = ((m>=0&&m<24)?m:0);
	}
	public void setSecond(int s){
		second = ((s>=0&&s<24)?s:0);
	}
	
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
}
