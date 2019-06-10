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
	public void familiesDefaultConstructorWorks_1() {
		Families testFamily = new Families();
		assertEquals(null, testFamily.getFamily());
	}

	@Test
	public void isFamilyASelected_2() {
		assertSame("A", Families.SelectFamily("A"));
		assertSame("A", Families.SelectFamily("a"));
	}

	@Test
	public void isFamilyBSelected_3() {
		assertSame("Family B", Families.SelectFamily("B"));
		assertSame("Family B", Families.SelectFamily("b"));
	}

	@Test
	public void isFamilyCSelected_4() {
		assertSame("Family C", Families.SelectFamily("C"));
		assertSame("Family C", Families.SelectFamily("c"));
	}

	@Test
	public void isExitSelected_5() {
		assertSame("X", Families.SelectFamily("X"));
		assertSame("X", Families.SelectFamily("x"));
	}
	
	@Test
	public void isFamilyOtherThanABorCorExitSelectedLetter_6() {
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("D"));
		assertEquals("Please select Family 'A', 'B', or 'C' only, or 'X' to exit.", Families.SelectFamily("Exit"));
	}
	
	@Test
	public void familyAStringsToIntegers_7() {
		assertEquals(10, 10, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyACalculation("10", "45", "15", "55"));
	}

	@Test
	public void familyAIsStartingHourBefore11PM_8() {
		assertEquals(10, 10, Families.FamilyACalculation("10", "45", "15", "55"));
	}
	
	@Test
	public void familyAPayBefore11PM_9() {
		assertEquals(15, 15, Families.FamilyACalculation("10", "45", "15", "55"));
		assertEquals(90, 90, Families.FamilyACalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void familyATotalPayStartingBefore11PM_10() {
		assertTrue(115 == Families.FamilyACalculation("10", "45", "15", "55"));
		assertTrue(110 == Families.FamilyACalculation("5", "45", "11", "55"));
		assertTrue(95 == Families.FamilyACalculation("10", "45", "15", "0"));
	}
	
	@Test
	public void familyATotalPayStartingAfter11PM_11() {
		assertTrue(80 == Families.FamilyACalculation("12", "45", "15", "55"));
	}
	
	@Test
	public void familyATotalPayStartingAt5PM_12() {
		assertTrue(190 == Families.FamilyACalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void familyATotalPayStartingAt1AM_13() {
		assertTrue(40 == Families.FamilyACalculation("13", "0", "15", "0"));
	}
	
	@Test
	public void familyBStringsToIntegers_14() {
		assertEquals(8, 8, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyBCalculation("8", "45", "15", "55"));
		}

	@Test
	public void familyBIsStartingHourBefore10PM_15() {
		assertEquals(9, 9, Families.FamilyBCalculation("9", "45", "15", "55"));
		}

	@Test
	public void familyBIsStartingHourBeforeMidnight_16() {
		assertEquals(11, 11, Families.FamilyBCalculation("12", "45", "15", "55"));
		}

	@Test
	public void familyBIsStartingHourAfterMidnight_17() {
		assertEquals(12, 12, Families.FamilyBCalculation("12", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyBCalculation("12", "45", "15", "55"));
		}
	
	@Test
	public void familyBPayBefore10PM_18() {
		assertEquals(92, 92, Families.FamilyBCalculation("8", "45", "15", "55"));
		assertEquals(76, 76, Families.FamilyBCalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void familyBTotalPayStartingBefore10PM_19() {
		assertTrue(104 == Families.FamilyBCalculation("8", "45", "15", "55"));
		assertTrue(76 == Families.FamilyBCalculation("5", "45", "11", "55"));
		assertTrue(100 == Families.FamilyBCalculation("7", "45", "14", "1"));
	}
	@Test
	public void familyBTotalPayStartingBefore10PMAndEndingIn0Minutes_20() {
		assertTrue(104 == Families.FamilyBCalculation("8", "45", "16", "0"));
		assertTrue(68 == Families.FamilyBCalculation("5", "45", "11", "0"));
	}
	
	@Test
	public void familyBTotalPayStartingAfter10PMAndBeforeMidnight_21() {
		assertTrue(16 == Families.FamilyBCalculation("10", "15", "11", "55"));
		assertTrue(72 == Families.FamilyBCalculation("11", "45", "15", "55"));
	}
	
	@Test
	public void familyBTotalPayStartingAfter10PMAndBeforeMidnightAndEndingIn0Minutes_22() {
		assertTrue(8 == Families.FamilyBCalculation("10", "15", "11", "0"));
		assertTrue(56 == Families.FamilyBCalculation("11", "45", "15", "0"));
	}
	
	@Test
	public void familyBTotalPayStartingAfterMidnight_23() {
		assertTrue(64 == Families.FamilyBCalculation("12", "45", "15", "55"));
		assertTrue(64 == Families.FamilyBCalculation("12", "1", "16", "0"));
	}
	
	@Test
	public void familyBTotalPayStartingAt5PM_24() {
		assertTrue(140 == Families.FamilyBCalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void familyBTotalPayStartingAt10PM_25() {
		assertTrue(64 == Families.FamilyBCalculation("10", "0", "15", "0"));
	}
	
	@Test
	public void familyBTotalPayStartingAtMidnight_26() {
		assertTrue(48 == Families.FamilyBCalculation("12", "0", "15", "0"));
	}
	
	@Test
	public void familyCStringsToIntegers_27() {
		assertEquals(8, 8, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(45, 45, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(15, 15, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(55, 55, Families.FamilyCCalculation("8", "45", "15", "55"));
		}

	@Test
	public void familyCIsStartingHourBefore9PM_28() {
		assertEquals(8, 8, Families.FamilyCCalculation("8", "45", "15", "55"));
		}
	
	@Test
	public void familyCPayBefore9PM_29() {
		assertEquals(21, 21, Families.FamilyCCalculation("8", "45", "15", "55"));
		assertEquals(84, 84, Families.FamilyCCalculation("5", "45", "11", "55"));
	}
	
	@Test
	public void familyCTotalPayStartingBefore9PM_30() {
		assertTrue(126 == Families.FamilyCCalculation("8", "45", "15", "55"));
		assertTrue(129 == Families.FamilyCCalculation("5", "45", "11", "55"));
		assertTrue(132 == Families.FamilyCCalculation("7", "45", "15", "0"));
	}
	
	@Test
	public void familyCTotalPayStartingAfter9PM_31() {
		assertTrue(60 == Families.FamilyCCalculation("12", "45", "15", "55"));
	}
	
	@Test
	public void familyCTotalPayStartingAt5PM_32() {
		assertTrue(189 == Families.FamilyCCalculation("5", "0", "15", "55"));
	}
	
	@Test
	public void familyCTotalPayStartingAt9PM_33() {
		assertTrue(90 == Families.FamilyCCalculation("9", "0", "15", "0"));
	}
}
