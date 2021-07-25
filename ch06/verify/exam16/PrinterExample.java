package verify.exam16;

import verify.exam15.Printer15;

public class PrinterExample {
	public static void main(String[] args) {
		var printer = new Printer15();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
