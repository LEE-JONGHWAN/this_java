package verify.exam18;

public class Account18 {
	private int balance;
	private final int MIN_BALANCE;
	private final int MAX_BALANCE;
	
	public int getBalance() {
		return balance;
	}
	
	public Account18(int min, int max) {
		MIN_BALANCE = min;
		MAX_BALANCE = max;
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE 
				&& balance <= MAX_BALANCE)
			this.balance = balance;
	}


	public static void main(String[] args) {
		

	}

}
