package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Families;

public class FamiliesTests {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void FamiliesDefaultConstructorWorks_1() {
		Families testFamily = new Families();
		assertEquals(null, testFamily.getFamily());
	}

	@Test
	public void IsFamilyASelected_2() {
		String startHour = null;
		String startMinute = null;
		String endHour = null;
		String endMinute = null;
		assertEquals(Families.FamilyACalculation(startHour, startMinute, endHour, endMinute), Families.SelectFamily("A"));
//		assertEquals("A", Families.SelectFamily("a"));
	}

	@Test
	public void IsFamilyBSelected_3() {
		assertEquals("B", Families.SelectFamily("B"));
		assertEquals("B", Families.SelectFamily("b"));
	}

	@Test
	public void IsFamilyCSelected_4() {
		assertEquals("C", Families.SelectFamily("C"));
		assertEquals("C", Families.SelectFamily("c"));
	}

	@Test
	public void IsExitSelected_5() {
		assertEquals("X", Families.SelectFamily("X"));
		assertEquals("X", Families.SelectFamily("x"));
	}
	
	@Test
	public void IsFamilyOtherThanABorCorExitSelectedLetter_6() {
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("D"));
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("Exit"));
	}
	
	@Test
	public void FamilyAStringsToIntegers_7() {
		assertEquals(10, 10, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyACalculation("10", "45", "15", "55"));
		}

	@Test
	public void FamilyAIsStartingHourBefore11PM_8() {
		assertEquals(10, 10, Families.FamilyACalculation("10", "45", "15", "55"));
		}
	
	@Test
	public void FamilyAPayBefore11PM_9() {
		assertEquals(15, 15, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(90, 90, Families.FamilyACalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void FamilyATotalPayStartingBefore11PM_10() {
		assertTrue(115 == Families.FamilyACalculation("10", "45", "15", "55"));
		assertTrue(110 == Families.FamilyACalculation("5", "45", "11", "55"));
		assertTrue(95 == Families.FamilyACalculation("10", "45", "15", "0"));

	}
	
	@Test
	public void FamilyATotalPayStartingAfter11PM_11() {
		assertTrue(80 == Families.FamilyACalculation("12", "45", "15", "55"));
	}
	
	@Test
	public void FamilyATotalPayStartingAt5PM_12() {
		assertTrue(190 == Families.FamilyACalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void FamilyATotalPayStartingAt1AM_13() {
		assertTrue(40 == Families.FamilyACalculation("13", "0", "15", "0"));

	}

}
