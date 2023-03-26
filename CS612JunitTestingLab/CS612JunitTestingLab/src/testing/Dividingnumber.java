package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dividingnumber {

	@Test
	void Truetest() {
		JunitTesting truetest= new JunitTesting();
		double output = truetest.divide(6, 3);
		assertEquals(2,output);
		
		
	}
	
	@Test
	void Falsetest() {
		JunitTesting falsetest= new JunitTesting();
		double output = falsetest.divide(6, 4);
		assertEquals(2,output);
		
      }
}