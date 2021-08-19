package sec07.exam01_generic_extends_implements;

import java.util.ArrayList;

public class StorageImpl<T> implements Storage<T> {
	private ArrayList<T> listing;
	private int capacity;
	
	public StorageImpl(int capacity) {
		this.listing = new ArrayList<T>();
		this.capacity = capacity;
	}
	
	@Override
	public void add(T item, int index) {
		if(index >=0 && index < capacity)
			listing.add(item);
	}

	@Override
	public T get(int index) {
		if(index >= 0 && index < listing.size())
			return listing.get(index);
		else
			return null;
	}
}
