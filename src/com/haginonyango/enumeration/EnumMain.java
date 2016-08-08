package com.haginonyango.enumeration;

import java.util.EnumSet;

import com.haginonyango.enumeration.PracticeEnum;
public class EnumMain {

	public static void main(String[] args) {
		
		for(PracticeEnum people: PracticeEnum.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		System.out.println("\nAnd now for the range of constants\n");
		
		for(PracticeEnum people: EnumSet.range(PracticeEnum.hagin, PracticeEnum.Jeff))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

	}
	

}
