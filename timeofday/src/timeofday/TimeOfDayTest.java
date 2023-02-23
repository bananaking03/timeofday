package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay tijd1 = new TimeOfDay(12, 30);
		
		assertEquals(12, tijd1.getHours() );
		assertEquals(30, tijd1.getMinutes() );
	}

}
