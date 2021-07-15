﻿package com.thisJava.ch15.sec5.ex01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");		
		treeSet.add("description");
		treeSet.add("c");
		treeSet.add("ever");
		treeSet.add("f");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", false, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}