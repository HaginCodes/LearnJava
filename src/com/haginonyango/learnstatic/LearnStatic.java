package com.haginonyango.learnstatic;

public class LearnStatic {
	private String first;
	private String last;
	private static int members = 0;
	
	public LearnStatic(String fn, String ln){
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the fazt club: %d \n",first, last, members);
	}
	
	
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}

	
	
}
