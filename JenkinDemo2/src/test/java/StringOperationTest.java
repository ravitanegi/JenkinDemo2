import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringOperationTest {
    StringOperation obj2;
    String first;
    String second;
	@Before
	public void setUp() throws Exception {
	obj2 = new StringOperation();
	first = "Development";
	second = "Testing";
	}

	@After
	public void tearDown() throws Exception {
		obj2 = null;
		first = null;
		second = null;
		
	}

	@Test
	public void test() {
		String result = obj2.concatenate(first, second);
		assertEquals(""
				+ "DevelopmentTesting",result);
	}

}
