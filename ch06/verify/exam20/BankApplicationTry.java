package verify.exam20;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BankApplicationTry {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = null;
	private static int count = 0;
	
	static {
		try {
			scanner = new Scanner(Path.of("resources/account.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = 0;
			
			if(scanner.hasNextLine()) {
				selectNo = Integer.parseInt(scanner.nextLine());
			} else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(selectNo);
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void withdraw() {
		System.out.println("출금");
		
		// 계좌번호 읽기
		String accNo = scanner.nextLine().trim();
		
		// 계좌번호 계좌목록에서 확인
		Account account = findAccount(accNo);
		
		// 바른 계좌 여부 판단
		if(account == null) {
			System.out.println("'" + accNo + 
						"'는 없는 계좌입니다.");
			return;
		}
		// 출금액 읽기
		int amount = Integer.parseInt(
				scanner.nextLine().trim());
		
		// 계좌 잔고에 출금액 반영
		account.setBalance(
				account.getBalance() - amount);
		
		// 아래 내용 출력
		System.out.println("계좌번호: " + account.getAno());
		System.out.println("출금액: " + amount);
		System.out.println("결과: 출금이 성공되었습니다.");
		System.out.println("출금후 잔고: " + account.getBalance());
	}

	private static void deposit() {
		System.out.println("예금");
		// 계좌번호 읽기
		String accNo = scanner.nextLine().trim();
		// 계좌번호 계좌목록에서 확인
		Account account = findAccount(accNo);
		
		// 존재하는 인덱스 파악
		if(account == null) {
			System.out.println("'" + accNo + 
						"'는 없는 계좌입니다.");
		}
		// 예금액 읽기
		int amount = Integer.parseInt(
				scanner.nextLine().trim());
		
		// 목록 항목에 예금액 반영
		account.setBalance(
				account.getBalance() + amount);
		
		// 아래 내용 출력
		System.out.println("계좌번호: " + account.getAno());
		System.out.println("예금액: " + amount);
		System.out.println("결과: 예금이 성공되었습니다.");
		System.out.println("예금후 잔고: " + account.getBalance());
	}
	private static Account findAccount(String accNo) {
		for(int i = 0; i < count; i++) {
			if(accountArray[i].getAno().equals(accNo)) {
				return accountArray[i];
			} 
		}
		return null;
	}
	

	private static void accountList() {
		System.out.println("계좌목록: ");
		for (int i = 0; i < count; i++) {
			System.out.println(accountArray[i]);
		}
	}

	private static void createAccount() {
		System.out.println("계좌생성");
		String accId = scanner.nextLine().trim();
		String owner = scanner.nextLine().trim();
		int balance = Integer.parseInt(scanner.nextLine().trim());
		Account account = new Account(
				accId, owner, balance);
		accountArray[count++] = account;
		System.out.println(account);
		System.out.println("계좌가 생성되었습니다.\n");
	}
}
















