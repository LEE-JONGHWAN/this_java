package com.thisJava.ch15.sec5.ex01_treeset;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = 
					new TreeSet<Integer>((s1,s2) ->
							Integer.compare(s1, s2));
		
		scores.add(Integer.valueOf(87));
		scores.add(Integer.valueOf(98));
		scores.add(Integer.valueOf(75));
		scores.add(Integer.valueOf(95));
		scores.add(Integer.valueOf(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(Integer.valueOf(80));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(Integer.valueOf(100));
		System.out.println("95점 위의 점수: " + score + "\n");		
		
		score = scores.floor(Integer.valueOf(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(Integer.valueOf(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}
