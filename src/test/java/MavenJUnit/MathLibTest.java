package MavenJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import MavenJUnit.MavenJUnit.MathLib;

public class MathLibTest {

	@Test
	public void test_Add1() {
		MathLib obj = new MathLib();
		assert(obj.Add(4, 3) == 7);
	
	}
	
	@Test
	public void test_Add2() {
		MathLib obj = new MathLib();
		assert(obj.Add(-4, -3)== -7);
	}
	
	@Test
	public void test_Add3() {
		MathLib obj = new MathLib();
		assert(obj.Add(-4, 3)==-1);
	}
	
	@Test
	public void test_Mul_positive() {
		MathLib obj = new MathLib();
		assert(obj.Mul(4, 3)==12);
	}
	
	public void test_Mul_negative() {
		MathLib obj = new MathLib();
		assert(obj.Mul(4, 3)==12);
	}
	
	@Test
	public void test_Div() {
		MathLib obj = new MathLib();
		assert(obj.Div(12, 3)==4);
	}

}
