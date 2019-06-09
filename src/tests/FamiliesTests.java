package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Families;

public class FamiliesTests {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void FamiliesDefaultConstructorWorks1() {
		Families testFamily = new Families();
		assertEquals(null, testFamily.getFamily());
	}

	@Test
	public void IsFamilyASelected2() {
		assertEquals("A", Families.SelectFamily("A"));
		assertEquals("A", Families.SelectFamily("a"));
	}

	@Test
	public void IsFamilyBSelected3() {
		assertEquals("B", Families.SelectFamily("B"));
		assertEquals("B", Families.SelectFamily("b"));
	}

	@Test
	public void IsFamilyCSelected4() {
		assertEquals("C", Families.SelectFamily("C"));
		assertEquals("C", Families.SelectFamily("c"));
	}

	@Test
	public void IsExitSelected5() {
		assertEquals("X", Families.SelectFamily("X"));
		assertEquals("X", Families.SelectFamily("x"));
	}
	
	@Test
	public void IsFamilyOtherThanABorCorExitSelectedLetter6() {
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("D"));
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("Exit"));
	}

}
