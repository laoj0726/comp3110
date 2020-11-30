import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class openFileTest {

	@Test
	void test() {
		board test = new board();
		boolean output = test.openFile();
		assertEquals(true, output);
	}

}
