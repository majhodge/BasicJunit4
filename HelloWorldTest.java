import static org.junit.Assert.*;
import org.junit.*;

public class HelloWorldTest {
	
	int sumResult, expectedSum;
	
	@Before
	public void setup() {
		sumResult = HelloWorld.sum(1, 10);
		expectedSum = 11;
	}

	@Test
	public void testSum() {
		assertEquals(sumResult, expectedSum);
	}
	
	@Ignore
	public void testSums() {
		assertNotEquals(sumResult, expectedSum);
	}
	
	@After
	public void finish() {
		System.out.println("Chillin");
	}
}
