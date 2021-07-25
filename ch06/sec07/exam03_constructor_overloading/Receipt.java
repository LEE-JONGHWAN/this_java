package sec07.exam03_constructor_overloading;

public class Receipt {
	private String menuName;
	private int dishCount;
	private double dishPrice;

	
	
	public Receipt(String menuName, int dishCount, double dishPrice) {
		super();
		this.menuName = menuName;
		this.dishCount = dishCount;
		this.dishPrice = dishPrice;
	}

	public double getTotalPrice(int digits) {
		double temp = 12345.67;
//		double temp = dishCount * dishPrice * 1.098;
		
		if(digits < 0) {
			double factor = Math.pow(10, -digits);
				temp = Math.round(temp / factor) * factor;
		}
		return temp;
	}
	
	public double getTotalPrice() {
		double temp = dishCount * dishPrice * 1.098;
		return temp;
	}
	
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getDishCount() {
		return dishCount;
	}
	public void setDishCount(int dishCount) {
		this.dishCount = dishCount;
	}
	public double getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
