import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class setUserNameTest {

	@Test
	void test() {
		board test = new board();
		String output = test.setUserRecord(10000);
		assertEquals("XYZ 10000", output);
	}

}
