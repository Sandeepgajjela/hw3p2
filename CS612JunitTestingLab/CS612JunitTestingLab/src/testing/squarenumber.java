package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squarenumber extends JunitTesting{

	@Test
	void squarenum() {
		JunitTesting squarenum = new JunitTesting();
		int output= squarenum.square(2);
		assertEquals(4,output);
		
	}

}
