import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ltidemos.Calculator;

class NewTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testCase1()
	{
		Assertions.assertEquals("Hello","Hello");
	}
	@Test 
	public void testAdd() {
		Calculator c = new Calculator();
		int r=c.add(100, 400);
		Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}

	@Test
	void testAssertNull() {
	String str1 = null;
	String str2 = "abc";
	Assertions.assertNull(str1);// str 1 is null - condition is ok test case ok
	Assertions.assertNotNull(str2); // str2 - notnull ? - condtion is ok - test case ok
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}
	@Test
	public void testEmptyArrayList1() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}





}
