package tan_walsh_test;

import org.junit.Test;
import static org.junit.Assert.*;
import tan_walsh.IntegerSequence;

public class IntegerTriangleTest{
	@Test
	public void testTriangle0() {
		assertEquals(IntegerSequence.tri(0), 0);
	}
	
	@Test
	public void testTriangle5() {
		assertEquals(IntegerSequence.tri(5), 15);
	}
	
	@Test
	public void testTriangle15() {
		assertEquals(IntegerSequence.tri(15), 120);
	}
}