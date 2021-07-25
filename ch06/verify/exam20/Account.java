package verify.exam20;

public class Account {
	private String ano;
	private String owner;
	private int balance;

	/**
	 * 
	 * @param ano  계좌번호
	 * @param owner 소유자 이름
	 * @param balance 최초 입금액
	 */
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "계좌번호: " + ano +
				"\n계좌주: " + owner + 
				"\n초기입금액:" + balance + "\n";
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
