package com.ezen.main;

public class UserInfo {
	private String 고객ID;
	private byte[] salt = new byte[16];
	private byte[] password = new byte[16];
	
	public String get고객ID() {
		return 고객ID;
	}
	public void set고객ID(String 고객id) {
		고객ID = 고객id;
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
