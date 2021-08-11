package com.ezen.nu6level;

import java.util.Scanner;

public class Step_1 {
	   private static Scanner scanner = new Scanner(System.in);
	   public static void main(String[] args) {
	      String userId = getUserId();
	      String password = getPassword();
	      
	      System.out.println("* 사용자 정보");
	      System.out.println("- 아이디: " + userId);
	      System.out.println("- 비밀번호: " + password);
	   }
	   private static String getPassword() {
	      System.out.print("비밀번호: ");
	      if (scanner.hasNextLine()) {
	         return scanner.nextLine();
	      }
	      return null;
	   }
	   private static String getUserId() {
	      System.out.print("사용자 ID: ");
	      if (scanner.hasNextLine()) {
	         return scanner.nextLine();
	      }
	      return null;
	   }

}
