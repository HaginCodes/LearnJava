package com.haginonyango.linked.list;

import java.util.*;
public class LinkedList {

	public static void main(String[] args) {
		
	String[] things = {"cubes","books,","life","programming","fun","parkour","freerunning"};
	
	List<String> list1 = new LearnLinkedList<String>();
	for(String x :things)
		list1.add(x);
	
	
	String[] things2 = {"sausage","bacon","goats","fun","life","puzzles"};
	List<String > list2 = new LearnLinkedList<String>();
	for(String y : things2)
		list2.add(y);
	
	list1.addAll(list2);
	list2 = null;
     
	printMe(list1);
	removeStuff(list1,2,5);
	printMe(list1);
	reverseMe(list1);
	}
	
	private static void printMe(List<String> l){
		for(String b : l)
			System.out.printf("%S ",b);
			System.out.println();
	}
	
	private static void removeStuff(List<String>l, int from , int to ){
		
		l.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String >l ){
		ListIterator<String> joe = l.listIterator(l.size());
		while(joe.hasPrevious())
			System.out.printf("%s ", joe.previous());
	}
	

}
