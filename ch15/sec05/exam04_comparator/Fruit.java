package sec05.exam04_comparator;

import java.util.Objects;

public class Fruit {
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name)
				&& price == other.price;
	}
	
}
