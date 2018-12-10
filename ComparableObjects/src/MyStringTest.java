
import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class MyStringTest {

	@Test
	public void testChainesEgales() {
		MyString s1 = new MyString("abcd");
		assertTrue(s1.equal(new MyString("Abcd")));
		assertFalse(s1.equal(new MyString("bbcd")));
		assertFalse(s1.equal(new MyString("accd")));
		assertFalse(s1.equal(new MyString("abdd")));
		assertFalse(s1.equal(new MyString("abce")));
		assertFalse(s1.equal(new MyString("abcde")));
		assertFalse(s1.equal(new MyString("abc")));
		assertTrue(s1.equal(s1));
	}
	
	
	@Test (expected=RuntimeException.class)
	public void testExceptionEgalPourChaineNulle() {
		MyString s1 = new MyString("abcd");
		s1.equal(null);
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionEgalPourNonComparable() {
		MyString s1 = new MyString("abcd");
		s1.equal(new MyColor(new Color(1,2,3)));
	}
	
	@Test
	public void testChainesInferieures() {
		MyString s1 = new MyString("abcd");
		assertTrue(s1.inferior(new MyString("bbcd")));
		assertTrue(s1.inferior(new MyString("accd")));
		assertTrue(s1.inferior(new MyString("abdd")));
		assertTrue(s1.inferior(new MyString("abce")));
		assertTrue(s1.inferior(new MyString("abcde")));
		assertFalse(s1.inferior(new MyString("abc")));
		assertFalse(s1.inferior(s1));
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionInferieurPourChaineNulle() {
		MyString s1 = new MyString("abcd");
		s1.inferior(null);
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionInferieurPourNonComparable() {
		MyString s1 = new MyString("abcd");
		s1.equal(new MyColor(new Color(1,2,3)));
	}

}
