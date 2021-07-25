package sec07.exam05_method_polymorphism.prac;

public class TextBook extends Book {
	private String subject; // 자료구조, 데이터베이스, ....
	private String form;
	
	// 유형: 종이, e-book, setter, getter ...
	
	
	@Override
	public String toString() {
		return "과목명: " + subject 
			+ ", 형태: " + form;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public TextBook(String title, String subject, String form) {
		super(title);
		this.subject = subject;
		this.form = form;
	}
}
