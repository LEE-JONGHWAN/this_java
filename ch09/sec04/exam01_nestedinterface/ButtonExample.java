package sec04.exam01_nestedinterface;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
//		btn.setOnClickListener(new CallListener());
		btn.setOnClickListener(() ->{ 
			System.out.println("전화를 겁니다.");
			});
		btn.touch();
		
		
		btn.setOnClickListener(new MessageListener());
		btn.setOnClickListener(() ->{
			System.out.println("메시지를 보냅니다.");
			});
		btn.touch();
	}
}
