package codebeer;

import static org.junit.Assert.*;

import org.junit.Test;

public class supTest {
	
	@Test
	public void testPower() throws Exception {
		int actualPower1 = sup.power(2, 3);
		int expectedPower1 = 8;
		
		int actualPower2 = sup.power(5, 2);
		int expectedPower2 = 25;
		
		assertEquals(expectedPower1, actualPower1);
		assertEquals(expectedPower2, actualPower2);
	}
}
