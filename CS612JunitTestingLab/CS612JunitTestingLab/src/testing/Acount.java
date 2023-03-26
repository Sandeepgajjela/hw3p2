package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Acount {

	@Test
	void A(){
		JunitTesting A=new JunitTesting();
		int output= A.count("SANDEEP");
		assertEquals(1,output);
		
	}

}
