package sec04.exam02_generic_method;

public class CompareMethodExample {
	public static void main(String[] args) {
		var p1 = new Pair<Integer, String>(1, "사과");
		var p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		var p3 = new Pair<String, String>("user1", "홍길동");
		var p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
	}
}
