package sec02.exam03_abstract_method;

public class HanbanAir implements Superman {

	@Override
	public void canFly() {
		System.out.print("비행기 > ");
		System.out.println("서울-부산 30분 완성");
	}
}
