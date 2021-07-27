package sec02.exam03_abstract_method;

import java.util.Scanner;

public class FoodMainStore implements FoodStore {

	@Override
	public void Menu() {
		System.out.println("=".repeat(40));
		System.out.println("1.김치볶음밥|2.삼겹살정식|3.된장찌개|4.종료");
		System.out.println("=".repeat(40));
		System.out.print("선택 > ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodMainStore foodM = new FoodMainStore();
		foodM.Menu();
		int pra = sc.nextInt();
		switch(pra) {
		case 1 :
			System.out.println("김치볶음밥을 주문하셨습니다.");
			System.out.println("맛있게 드십시오.");
			break;
		case 2 :
			System.out.println("삼겹살정식을 주문하셨습니다.");
			System.out.println("맛있게 드십시오.");
			break;
		case 3 :
			System.out.println("된장찌개을 주문하셨습니다.");
			System.out.println("맛있게 드십시오.");
			break;
		case 4 :
			System.out.println("주문을 종료합니다.");
			System.out.println("안녕히 가십시오.");
			break;
		}
	}

}
