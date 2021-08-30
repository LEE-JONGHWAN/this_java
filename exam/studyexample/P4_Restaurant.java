package studyexample;

import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor @Getter //Lombok 애노테이션
class Customer {
	private String repName; // 팀 대표 이름
	private int partySize; // 팀 원 숫자
}

public class P4_Restaurant {
	private static Vector<Customer> customers;
	
	public static void main(String[] args) {
		customers= new Vector<Customer>();
		customers.add(new Customer("김씨네", 3));
		customers.add(new Customer("최씨네", 2));
		
		빈자리_고객할당(1); // 1 : 빈 좌석 수
		빈자리_고객할당(2);
	}

	private static void 빈자리_고객할당(int size) {
		Customer serveNow = pollFirstOfSize(size);
		System.out.print(size + "자리: ");
		if (serveNow == null) {
			System.out.println("(해당 팀 없음)");
		} else {
			System.out.println(serveNow.getRepName());
		}
	}

	/**
	 * 주어진 크기를 초과하지 않는 첫 고객 팀을 찾아서 수집에서 제거하고
	 * 반환한다.
	 * @param size 주어진 크기
	 * @return 조건을 충족하는 첫 고객 팀.
	 */
	private static Customer pollFirstOfSize(int size) {
		// 빈 곳 6
		for(Customer cus : customers) {
			if(cus.getPartySize() <= size) {
				return cus;
			} 
		}
		return null;
	}
}