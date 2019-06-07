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
	public void IsFamilyASelected() {
		assertEquals("A", Families.SelectFamily("A"));
		assertEquals("a", Families.SelectFamily("a"));
	}

	@Test
	public void IsFamilyBSelected() {
		assertEquals("B", Families.SelectFamily("B"));
		assertEquals("b", Families.SelectFamily("b"));
	}

	@Test
	public void IsFamilyCSelected() {
		assertEquals("C", Families.SelectFamily("C"));
		assertEquals("c", Families.SelectFamily("c"));
	}
	@Test
	public void IsFamilyOtherThanABorCSelected() {
		assertEquals("Please select Family A, B, or C only.", Families.SelectFamily("D"));
		assertEquals("Please select Family A, B, or C only.", Families.SelectFamily("d"));
	}

}
