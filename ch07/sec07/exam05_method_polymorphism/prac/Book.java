package sec07.exam05_method_polymorphism.prac;

 public class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "책 제목: " + title ;
	}
}
