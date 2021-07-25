package sec12.exam03_import.hankook.미쉐린;

public class Tire {
	boolean snowTire = true;
	float radius = 65;
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public boolean isSnowTire() {
		return snowTire;
	}

	public void setSnowTire(boolean isSnowTire) {
		this.snowTire = isSnowTire;
	}

	public static void main(String[] args) {
		Tire frontTrie = new Tire();
//		System.out.println(frontTrie.is);
	}

}
