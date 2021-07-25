package sec02.exam01_inheritance;

public class ChildA extends Parents{
	public ChildA() {
		super();
		System.out.println("난 자식 생성자");
	}
	
	public static void main(String[] args) {
		ChildA aChild = new ChildA();
	}
}
