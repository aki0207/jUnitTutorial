import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalucuratorTest {

	@Test
	public void resultOfMultiplyingThreeAndFour() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3,4);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void resultOfMultiplyingFiveAndSeven() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5,7);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ResultOfdivisionThreeAndTwo() {
		Calculator calc = new Calculator();
		double expected = 1.5;
		double actual = calc.divide(3,2);
		assertThat(actual,is(expected));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divisinInCaseOfZero() {
		Calculator calc = new Calculator();
		calc.divide(5,0);
		
	}
	
}
