import org.junit.Test;
import static org.junit.Assert.*;
import IntegerSequence;

public class IntegerLazyTest{
	
	@Test
	public void test0(){
		assertEquals(IntegerSequence.lazy(0), 1);
	}

	@Test
	public void test5() {
		assertEquals(IntegerSequence.lazy(5), 16);
	}

	@Test
	public void test10() {
		assertEquals(IntegerSequence.lazy(10), 56);
	}
}
