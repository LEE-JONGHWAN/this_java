package sec06.exam01_generic_wildcard;

import java.util.ArrayList;

public class Course<T> {
	private String name;
	private ArrayList<T> 수강자들;
	private int capacity;
	
	public Course(String name, int capacity) {
		this.name = name;
//		수강자들 = (T[]) (new Object[capacity]);
		수강자들 = new ArrayList<T>();
		this.capacity = capacity;
	}

	public String getName() { return name; }
	public ArrayList<T> getStudents() { return 수강자들; }
	public void add(T t) {
			if(수강자들.size() < capacity) {
				수강자들.add(t);
		}
	}
}
