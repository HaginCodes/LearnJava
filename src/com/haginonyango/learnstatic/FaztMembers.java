package com.haginonyango.learnstatic;

public class FaztMembers {
	
	public static void main(String[] args){

	LearnStatic member1 = new LearnStatic("Feliks","Zemdegs");
	LearnStatic member2 = new LearnStatic("Mats","Valk");
	LearnStatic member3 = new LearnStatic("Lucas","Etter");
	
	
	System.out.println(LearnStatic.getMembers());
	
	System.out.println();
	//is unique
	System.out.println(member1.getFirst());
	//is unique
	System.out.println(member1.getLast());
	//get members is shared with everyone
	System.out.println(member1.getMembers());


	}
	
	

}
