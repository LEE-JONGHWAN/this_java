package sec05.exam02_treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		var scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		
		NavigableMap<Integer,String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		
		descendingEntrySet.forEach(e
				-> System.out.println(e.getKey() + "-" + e.getValue() + " "));
		for(var key : descendingMap.keySet()) {
			if(key >= 90) {
				System.out.println(key + ", " + descendingMap.get(key));
			}
		}
		
		
		
		System.out.println();
		
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		
		
//		scores
//			.descendingMap().entrySet().stream()
//			.map(e -> e.getKey() + "-" + e.getValue() + " ")
//			.forEach(System.out::print);
//		System.out.println();
//		
//		var ascendingMap = scores;    // descendingMap.descendingMap();
//		var ascendingEntrySet = ascendingMap.entrySet();
//		for(var entry : ascendingEntrySet) {
//			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
//		}
	}
}
