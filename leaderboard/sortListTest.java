import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sortListTest {

	@Test
	void test() {
		board test = new board();
		int arr[] = {3,2,1};
		boolean output = test.sortList(arr);
		assertEquals(true, output);
	}

}
