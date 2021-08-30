package studyexample;

import java.awt.Container;


public class ID_container {
	private int id;
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}


	public ID_container(int id) {
		super();
		this.id = id;
	}
	
	static void getID(ID_container container) {
		container.setId(300);
	}
	
	public static void main(String[] args) {
		var container = new ID_container(0);
		getID(container);
		System.out.println(container.getId());
	}

}
