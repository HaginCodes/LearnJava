package com.haginonyango.linkedlist;

import java.util.*;
public class Things {

	public static void main(String[] args) {
		
		String[] cubes = {"moyu","guoguan","GTS","Gans Air","Guansu"};
		List<String> list = new LinkedList<String>();
		for(String x: cubes){
			list.add(x);
			
			String[] BGcubes = {"v cube"," lan lan", "cyclone boys","rubiks brand"};
			List<String> list1 = new LinkedList<String>();
			for(String y: BGcubes){
				list1.add(y);
				
				
				list.addAll(list1);
				list1 = null;
				
				printMe(list1);
				removeStuff(list1, 2,5);
				printMe(list1);
				reverseMe(list1);
			}
		}
	}
	
	private static void printMe(List<String>l){
		for(String b : l)
			System.out.printf("%s ", b);
		System.out.println();
	}
	
	private static void removeStuff(List<String>l, int from , int to){
		l.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String>l){
		ListIterator<String> iterator = l.listIterator(l.size());
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
}
