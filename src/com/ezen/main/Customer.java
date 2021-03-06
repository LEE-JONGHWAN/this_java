package com.ezen.main;

public class Customer {
	private int 고객SN;
	private String 고객ID;
	private String 고객이름;
	private byte[] salt = new byte[16];
	private byte[] password = new byte[16];
	
	public Customer() {
		super();
	}

	public Customer(int 고객SN, String 고객이름) {
		this.고객SN = 고객SN;
		this.고객이름 = 고객이름;
		salt = new byte[16];
		password = new byte[16];
	}

	public String get고객ID() {
		return 고객ID;
	}

	public void set고객ID(String 고객id) {
		고객ID = 고객id;
	}

	public int get고객SN() {
		return 고객SN;
	}

	public void set고객SN(int 고객sn) {
		고객SN = 고객sn;
	}

	public String get고객이름() {
		return 고객이름;
	}

	public void set고객이름(String 고객이름) {
		this.고객이름 = 고객이름;
	}

	public byte[] getSalt() {
		return salt;
	}

	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}
}
