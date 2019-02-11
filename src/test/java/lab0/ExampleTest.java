package lab0;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is just an example of how to structure the tests for the labs from now on
 */
public class ExampleTest {
	private static Logger log = LoggerFactory.getLogger(ExampleTest.class);
	private static Example example;
	
	/**
	 * Initializes the object to perform tests
	 */
	@BeforeClass
	public static void setup() {
		example = new Example();
	}
	
	/**
	 * Calculates the sum of 10 and 15
	 */
	@Test
	public void sumEquals() {
		int result = example.sum(10, 15);
		assertEquals("The sum of 10 and 15 must be 25", 25, result);
		log.debug("The result is: " + result);
	}
	
	/**
	 * Calculates the factorial of -4: NO OK
	 */
	@Test
	public void sumNotEquals() {
		int result = example.sum(100, 200);
		assertNotEquals("The sum of 100 and 200 should not be 301", 301, result);
		log.info("The result is: " + result);
	}
	
}
