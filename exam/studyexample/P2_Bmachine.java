package studyexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntPredicate;



public class P2_Bmachine {
	public static HashMap<String, Double> get자판기() {
		var 자판기 = new HashMap<String, Double>();
		
		자판기.put("콜라", 1100d);
		자판기.put("사이다", 1000d); // 구매 가능
		자판기.put("비타500", 600d); // 구매 가능
		자판기.put("생수", 800d); // 구매 가능
		
		return 자판기;
	}
	
	// 빈 곳 3 (필요한 메소드 작성할 것)
	public int call구매가능제품종류(HashMap<String, Double> 자판기, 
			double amount) {
		return 구매가능제품종류(자판기,amount);
	}

	private int 구매가능제품종류(HashMap<String, Double> 자판기, 
			double amount) {
		int count = 0;
		for(var se : 자판기.entrySet()) {
			if(se.getValue() <= amount) {
				count++;
			}
		}
		return count;
	}
}