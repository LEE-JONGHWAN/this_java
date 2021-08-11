package com.ezen.nu6level;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.jbpark.dabang.module.Utility;
import com.jbpark.utility.SecureMan;


class UserInfoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	UserInfoException(String msg) {
		super(msg);
	}
	
}




public class LoginPro_Test {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		
		static String getUserInfoStr(HashMap<String, String> u
		var sb = new StringBuilder("- 아이디: " + userInfo.get("userId"));
		sb.append("- 비밀번호: " + userInfo.get("password"));
		return sb.toString();
		
		//내가 짠거...
//		Scanner sc = new Scanner(System.in);
//		System.out.println("userId를 입력하세요.");
//		System.out.print("아이디>");
//		String userId = sc.nextLine();
//		System.out.println("password를 입력하세요.");
//		System.out.print("비밀번호>");
//		String password = sc.nextLine();
//		
//		System.out.println("입력하신 userId는 : " + userId + " 입니다.");
//		System.out.println("입력하신 password는 : " + password + " 입니다.");
		  
//	      String userId = getUserId();
//	      String password = getPassword();
//	      System.out.println("* 사용자 정보");
//	      System.out.println("- 아이디: " + userId);
//	      System.out.println("- 비밀번호: " + password);
		
//	      System.out.println("* 사용자 정보");
//	      System.out.println("- 아이디: " + userInfo.get("userId"));
//	      System.out.println("- 비밀번호: " + userInfo.get("password"));
	}

	private static boolean isValidSyntax(HashMap<String, String> userInfo)
		throws UserInfoException {
		String userId = userInfo.get("userId");
		if(!Utility.isValidID(userId)) {
			throw
		}
	}
	
	
	   private static HashMap<String, String> getUserInfo() {
		      var userInfo = new HashMap<String, String>();
		      System.out.print("사용자 ID: ");
		      if (sc.hasNextLine()) {
		         userInfo.put("userId", sc.nextLine().trim());
		      }
		      System.out.print("비밀번호: ");
		      if (sc.hasNextLine()) {
		         userInfo.put("password", sc.nextLine().trim());
		      }
		      return userInfo;
		   }	      
}
//	   private static HashMap<String, String> getUserInfo() {
//		   var userInfo = new HashMap<String, String>();
//		   System.out.print("사용자 ID: ");
//		   if (sc.hasNextLine()) {
//			   userInfo.put("userId", sc.nextLine().trim());
//		   }
//		   System.out.print("비밀번호: ");
//		   if (sc.hasNextLine()) {
//			   userInfo.put("password", sc.nextLine().trim());
//		   }
//		   return userInfo;
//	   }
	
	
//	private static String getUserId() {
//		System.out.print("사용자 ID: ");
//			if(sc.hasNextLine()) {
//				return sc.nextLine();
//			}
//			return null;
//	}
//	
//	private static String getPassword() {
//		System.out.print("비밀번호: ");
//			if(sc.hasNextLine()) {
//				return sc.nextLine();
//			}
//			return null;
//	}

