package sec07.exam05_method_polymorphism.prac;


enum Preper{
	주간, 월간, 년간
}

public class Periodicals extends Book{
	//발행주기 // enum(주간, 월간, 년간)
	private String name;
	private Preper cycle;
	private String form;
	
	public Periodicals(String title, Preper cycle, String form) {
		super(title);
		this.cycle = cycle;
		this.form = form;
	}

	@Override
	public String toString() {
		return "교재 제목 : " + name 
				+ ", 과목명 : " + cycle + ", 형태 : " + form;
	}
	
	public static void main(String[] args) {
		var tt = new Periodicals("이거", Preper.년간, "E-Book");
	}
	
	
	
}
