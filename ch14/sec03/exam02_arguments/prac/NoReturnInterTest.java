package sec03.exam02_arguments.prac;

public class NoReturnInterTest {

	public static void main(String[] args) {
		NoReturnInter noRet = 
				name -> System.out.println(
						name + "씨 안녕하세요.");
			noRet.doSth("홍길동");
	}

}
