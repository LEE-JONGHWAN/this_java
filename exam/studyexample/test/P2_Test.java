package studyexample.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import studyexample.P2_Bmachine;

public class P2_Test {
	
	@Test
	public void test() {
		var machine = new P2_Bmachine();
		int count = 0;
		count = machine.call구매가능제품종류(P2_Bmachine.get자판기(), 1000);
		assertEquals(3, count);
		}
	}
