import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isGameEndTest {

	@Test
	void test() {
		board test = new board();
		boolean output = test.isGameEnd(true);
		assertEquals(true, output);
	}

}
