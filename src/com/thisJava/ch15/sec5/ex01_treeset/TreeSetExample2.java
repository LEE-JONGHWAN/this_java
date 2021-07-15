package com.thisJava.ch15.sec5.ex01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores 
			= new TreeSet<Integer>();
		scores.add(Integer.valueOf(87));
		scores.add(Integer.valueOf(98));
		scores.add(Integer.valueOf(75));
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(80));
		
		NavigableSet<Integer> descendingSet 
			= scores.descendingSet();
		
		descendingSet.forEach(s -> System.out.print(s + " "));
		System.out.println();

		
		NavigableSet<Integer> ascendingSet 
			= descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}
}
