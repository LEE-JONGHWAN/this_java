package sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", new Integer(10));
		treeMap.put("f", new Integer(60));
		treeMap.put("forever", new Integer(60));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(10));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));

		System.out.println("[c~f 사이의 단어 검색]");

		//@formatter:off
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "f", false);
		rangeMap.entrySet().stream()
			.map(entry->
			entry.getKey() + "-" + entry.getValue() + "페이지")
			.forEach(System.out::println);
		treeMap.values().stream().forEach(System.out::println);

		
	}
}
