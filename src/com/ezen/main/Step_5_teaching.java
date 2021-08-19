package com.ezen.main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import com.jbpark.dabang.module.AddressMan;
import com.jbpark.dabang.module.Utility;

public class Step_5_teaching {
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
				String userId = userInfo.get("userId");
				if (doUserExists(userId)) {
					System.out.println("다음은 존재하는 사용자ID입니다: " + userId);
				} else {
					throw new UserInfoException("존재하지 않는 사용자ID: " + userId);
				}
			}
		} catch (UserInfoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static Connection conn = AddressMan.getConnection();

	private static boolean doUserExists(String 고객ID) {
		String countSql = "select count(*) from 전통고객" 
						+ " where 고객ID = '" + 고객ID + "'";

		try {
			Statement getStmt = conn.createStatement();
			ResultSet rs = getStmt.executeQuery(countSql);

			if (rs.next()) {
				int count = rs.getInt(1);

				return count == 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private static boolean isValidSyntax(HashMap<String, String> userInfo) throws UserInfoException {
		String userId = userInfo.get("userId");
		StringBuilder excepMsg = null;
		if (!Utility.isValidID(userId)) {
			excepMsg = new StringBuilder();
			excepMsg.append("사용자ID가 형식이 맞지 않습니다: ");
			excepMsg.append(userId);
			excepMsg.append("\n");
		}

		String password = userInfo.get("password");
		if (!Utility.isValidPassword(password)) {
			if (excepMsg == null) {
				excepMsg = new StringBuilder();
			}
			excepMsg.append("비밀번호가 형식이 맞지 않습니다: ");
			excepMsg.append(password);
		}
		if (excepMsg != null)
			throw new UserInfoException(excepMsg.toString());

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

