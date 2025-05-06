import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathLibTest {

	@Test
	void test_add() {
		MathLib obj = new MathLib();
		assert(obj.add(3, 4)==7);
		assert(obj.add(-3, -4)==-7);
		assert(obj.add(3, -4)==-1);
	}
	
	@Test
	void test_quotient() {
		MathLib obj = new MathLib();
		assert(obj.quotient(3, 2)==1);	
	}
	
	@Test
	void test_remainder() {
		MathLib obj = new MathLib();
		assert(obj.remainder(5, 4)==1);	
	}
	
	@Test
	void test_multiply() {
		MathLib obj = new MathLib();
		assert(obj.multiply(3, 4)==12);
	}

}
