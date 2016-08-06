package com.haginonyango.enumeration;


// enumerations are constants that are also objects
public enum PracticeEnum {

	hagin("smart","15"),
	Joy("bae","15"),
	Olivia("twinzie", "14");
	
	private final String desc;
	private final String year;
	
	PracticeEnum(String description, String age){
		desc = description;
		year = age;
		
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}
