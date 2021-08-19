package com.ezen.main;

import java.util.HashMap;
import java.util.Scanner;

public class Step_2 {
	   private static Scanner scanner = new Scanner(System.in);
	   public static void main(String[] args) {
	      HashMap<String, String> userInfo = getUserInfo();
	      
	      System.out.println("* 사용자 정보");
	      System.out.println("- 아이디: " + userInfo.get("userId"));
	      System.out.println("- 비밀번호: " + userInfo.get("password"));
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
