package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
//		System.out.println("vol : " + rc.getVolume());
		Searchable searchable = tv;
		searchable.search("한반");
		tv.setMute(false);
	}
}
