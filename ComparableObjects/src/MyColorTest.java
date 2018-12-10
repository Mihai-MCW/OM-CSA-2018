
import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class MyColorTest {

	@Test
	public void testCouleursEgales() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		MyColor c2 = new MyColor(new Color(1,2,3));
		MyColor c3 = new MyColor(new Color(2,2,3));
		MyColor c4 = new MyColor(new Color(1,3,3));
		MyColor c5 = new MyColor(new Color(1,2,4));
		assertTrue(c1.equal(c2));
		assertFalse(c1.equal(c3));
		assertFalse(c1.equal(c4));
		assertFalse(c1.equal(c5));
	}

	@Test (expected=RuntimeException.class)
	public void testExceptionEgalPourCouleurNulle() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		c1.equal(null);
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionEgalPourNonComparable() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		c1.equal(new MyString("test"));
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionInferieurPourCouleurNulle() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		c1.inferior(null);
	}
	
	@Test (expected=RuntimeException.class)
	public void testExceptionInferieurPourNonComparable() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		c1.inferior(new MyString("test"));
	}
	
	@Test 
	public void testCouleursInferieures() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		MyColor c2 = new MyColor(new Color(1,2,4));
		MyColor c3 = new MyColor(new Color(1,2,2));
		assertTrue(c1.inferior(c2));
		assertFalse(c1.inferior(c3));
		assertFalse(c1.inferior(c1));
	}
	
	@Test 
	public void testCouleursInferieuresOuEgales() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		MyColor c2 = new MyColor(new Color(1,2,4));
		MyColor c3 = new MyColor(new Color(1,2,2));
		assertTrue(c1.inferiorOrEqual(c2));
		assertFalse(c1.inferiorOrEqual(c3));
		assertTrue(c1.inferiorOrEqual(c1));
	}
	
	@Test
	public void testCouleursSuperieures() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		MyColor c2 = new MyColor(new Color(1,2,4));
		MyColor c3 = new MyColor(new Color(1,2,2));
		assertFalse(c1.superior(c2));
		assertTrue(c1.superior(c3));
		assertFalse(c1.superior(c1));
	}
	
	@Test
	public void testCouleursSuperieuresOuEgales() {
		MyColor c1 = new MyColor(new Color(1,2,3));
		MyColor c2 = new MyColor(new Color(1,2,4));
		MyColor c3 = new MyColor(new Color(1,2,2));
		assertFalse(c1.superiorOrEqual(c2));
		assertTrue(c1.superiorOrEqual(c3));
		assertTrue(c1.superiorOrEqual(c1));
	}
}
