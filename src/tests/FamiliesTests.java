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
	
	@Test
	public void FamilyBStringsToIntegers_14() {
		assertEquals(8, 8, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyBCalculation("8", "45", "15", "55"));
		}

	@Test
	public void FamilyBIsStartingHourBefore10PM_15() {
		assertEquals(9, 9, Families.FamilyBCalculation("9", "45", "15", "55"));
		}

	@Test
	public void FamilyBIsStartingHourBeforeMidnight_16() {
		assertEquals(11, 11, Families.FamilyBCalculation("12", "45", "15", "55"));
		}

	@Test
	public void FamilyBIsStartingHourAfterMidnight_17() {
		assertEquals(12, 12, Families.FamilyBCalculation("12", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyBCalculation("12", "45", "15", "55"));
		}
	
	@Test
	public void FamilyBPayBefore10PM_16() {
		assertEquals(92, 92, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(76, 76, Families.FamilyBCalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void FamilyBTotalPayStartingBefore10PM_17() {
		assertTrue(104 == Families.FamilyBCalculation("8", "45", "15", "55"));
		assertTrue(76 == Families.FamilyBCalculation("5", "45", "11", "55"));
		assertTrue(100 == Families.FamilyBCalculation("7", "45", "14", "1"));
	}
	@Test
	public void FamilyBTotalPayStartingBefore10PMAndEndingIn0Minutes_18() {
		assertTrue(104 == Families.FamilyBCalculation("8", "45", "16", "0"));
		assertTrue(68 == Families.FamilyBCalculation("5", "45", "11", "0"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAfter10PMAndBeforeMidnight_19() {
		assertTrue(16 == Families.FamilyBCalculation("10", "15", "11", "55"));
		assertTrue(72 == Families.FamilyBCalculation("11", "45", "15", "55"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAfter10PMAndBeforeMidnightAndEndingIn0Minutes_20() {
		assertTrue(8 == Families.FamilyBCalculation("10", "15", "11", "0"));
		assertTrue(56 == Families.FamilyBCalculation("11", "45", "15", "0"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAfterMidnight_21() {
		assertTrue(64 == Families.FamilyBCalculation("12", "45", "15", "55"));
		assertTrue(64 == Families.FamilyBCalculation("12", "1", "16", "0"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAt5PM_22() {
		assertTrue(140 == Families.FamilyBCalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAt10PM_23() {
		assertTrue(64 == Families.FamilyBCalculation("10", "0", "15", "0"));
	}
	
	@Test
	public void FamilyBTotalPayStartingAtMidnight_24() {
		assertTrue(48 == Families.FamilyBCalculation("12", "0", "15", "0"));
	}
	
	@Test
	public void FamilyCStringsToIntegers_14() {
		assertEquals(8, 8, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyCCalculation("8", "45", "15", "55"));
		}

	@Test
	public void FamilyCIsStartingHourBefore9PM_15() {
		assertEquals(8, 8, Families.FamilyCCalculation("8", "45", "15", "55"));
		}
	
	@Test
	public void FamilyCPayBefore9PM_16() {
		assertEquals(21, 21, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(84, 84, Families.FamilyCCalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void FamilyCTotalPayStartingBefore9PM_17() {
		assertTrue(126 == Families.FamilyCCalculation("8", "45", "15", "55"));
		assertTrue(129 == Families.FamilyCCalculation("5", "45", "11", "55"));
		assertTrue(132 == Families.FamilyCCalculation("7", "45", "15", "0"));
	}
	
	@Test
	public void FamilyCTotalPayStartingAfter9PM_18() {
		assertTrue(60 == Families.FamilyCCalculation("12", "45", "15", "55"));
	}
	
	@Test
	public void FamilyCTotalPayStartingAt5PM_19() {
		assertTrue(189 == Families.FamilyCCalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void FamilyCTotalPayStartingAt9PM_20() {
		assertTrue(90 == Families.FamilyCCalculation("9", "0", "15", "0"));
	}
}
