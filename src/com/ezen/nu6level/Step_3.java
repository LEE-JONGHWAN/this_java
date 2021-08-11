package com.ezen.nu6level;

import java.util.HashMap;
import java.util.Scanner;

import com.jbpark.dabang.module.Utility;

class UserInfoException extends Exception {
	private static final long serialVersionUID = 1L;

	UserInfoException(String msg) {
		super(msg);
	}
}

public class Step_3 {

	private static Scanner scanner = new Scanner(System.in);

	static String getUserInfoStr(HashMap<String, String> userInfo) {
		var sb = new StringBuilder("- 아이디: " + userInfo.get("userId"));
		sb.append("- 비밀번호: " + userInfo.get("password"));
		return sb.toString();
	}

	public static void main(String[] args) {
		HashMap<String, String> userInfo = getUserInfo();
		try {
			if (isValidSyntax(userInfo)) {
				System.out.println("다음 바른 사용자입니다.");
				System.out.println(getUserInfoStr(userInfo));
			}
		} catch (UserInfoException e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean isValidSyntax(HashMap<String, String> userInfo) throws UserInfoException {
		String userId = userInfo.get("userId");
		if (!Utility.isValidID(userId)) {
			throw new UserInfoException("사용자ID가 형식이 맞지 않습니다: " + userId);
		}
		String password = userInfo.get("password");
		if (!Utility.isValidPassword(password)) {
			throw new UserInfoException("비밀번호가 형식이 맞지 않습니다: " + password);
		}

		return true;
	}

	private static HashMap<String, String> getUserInfo() {
		var userInfo = new HashMap<String, String>();
		System.out.print("사용자 ID: ");
		if (scanner.hasNextLine()) {
			userInfo.put("userId", scanner.nextLine().trim());
		}
		System.out.print("비밀번호: ");
		if (scanner.hasNextLine()) {
			userInfo.put("password", scanner.nextLine().trim());
		}
		return userInfo;
	}
}
