import static org.junit.Assert.*;

import org.junit.Test;


public class EnvironmentTest {
	
	/**
	 * Always succeeds. Tests the test runner.
	 */
	@Test
	public void testTestRunner() {
		assertTrue(true);
	}

	@Test
	public void testGetDefault() {
		assertEquals(Environment.get("foo",  "default"), "default");
	}

	@Test
	public void testGetUserDir() {
		// http://www.mindspring.com/~mgrand/java-system-properties.htm
		assertEquals(Environment.get("user.dir",  "default"), System.getProperty("user.dir"));
	}

	@Test
	public void testGetUser() {
		assertEquals(Environment.get("USER",  "default"), System.getenv().get("USER"));
	}

	
}
