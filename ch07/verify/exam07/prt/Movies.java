package verify.exam07.prt;

public class Movies {
	private String name;
	
	
	public String gettingName() {
		return name;
	}
	public void settingName(String name) {
		this.name = name;
	}
	public Movies(String name) {
		super();
		this.name = name;
	}
	public void run() {
		System.out.println("영화가 시작됩니다.");
	}
	
}
