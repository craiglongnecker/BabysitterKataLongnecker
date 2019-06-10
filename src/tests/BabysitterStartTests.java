package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.BabysitterStart;

public class BabysitterStartTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void doesBabysittersStartConstructorWork_1() {
		BabysitterStart testBabysitterName = new BabysitterStart();
		assertEquals(null, testBabysitterName.getName());
	}
	
//	@Test
//	public void whatIsBabysittersName_2() {
//		assertEquals("Barb", BabysitterStart.BabysitterName("Barb"));
//	}
	
	@Test
	public void isTheBabysittersStartingHour5PMOrLater_3() {
		assertEquals("5", BabysitterStart.BabysitterStartingHour(0, 5));
	}

	@Test
	public void theBabysittersStartingHourCannotBeBefore5PM_4() {
		assertEquals("You cannot start babysitting before 5:00 PM.", BabysitterStart.BabysitterStartingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersStartingHourBefore4AMOrEarlier_5() {
		assertEquals("12", BabysitterStart.BabysitterStartingHour(1, 0));
	}
	
	@Test
	public void theBabysittersStartingHourCannotBeAfter4AM_6() {
		assertEquals("You cannot start babysitting after 4:00 AM.", BabysitterStart.BabysitterStartingHour(1, 5));
	}
	
	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsANegativeInteger_7() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, -2));
	}
	
	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsGreaterThan11PM_8() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, 12));
	}

	@Test
	public void theBabysittersStartingHourWithAnErrorForPMOrAM_9() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(2, 2));
	}

	@Test
	public void theBabysittersStartingMinute_10() {
		assertEquals("02", BabysitterStart.BabysitterStartingMinute(2));
	}

	@Test
	public void theBabysittersStartingMinuteWithOver59MinutesError_11() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(60));
	}

	@Test
	public void theBabysittersStartingMinuteWithNegativeMinutesError_12() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(-5));
	}
	
	@Test
	public void isTheBabysittersEndingHour4AMOrEarlier_13() {
		assertEquals("16", BabysitterStart.BabysitterEndingHour(1, 4));
	}

	@Test
	public void theBabysittersEndingHourCannotBeBefore5PM_14() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersEndingHourBeforeMidnightOrEarlier_15() {
		assertEquals("10", BabysitterStart.BabysitterEndingHour(0, 10));
	}
	
	@Test
	public void theBabysittersEndingHourCannotBeAfter4AM_16() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(1, 5));
	}
	
	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsANegativeInteger_17() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, -2));
	}
	
	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsGreaterThan11AM_18() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, 12));
	}

	@Test
	public void theBabysittersEndingHourWithAnErrorForPMOrAM_19() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(2, 2));
	}

	@Test
	public void theBabysittersEndingMinute_20() {
		assertEquals("2", BabysitterStart.BabysitterEndingMinute(2));
	}

	@Test
	public void theBabysittersEndingMinuteWithOver59MinutesError_21() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(60));
	}

	@Test
	public void theBabysittersEndingMinuteWithNegativeMinutesError_22() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(-5));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsNotBeforeStartingTime_23() {
		assertEquals("495", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 13, 45));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsSameAsOrBeforeStartingTime_24() {
		assertEquals("Error. Babysitting ending time cannot be the same as or before the starting time.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 5, 30));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsLessThan60MinutesBeforeStartingTime_25() {
		assertEquals("You must babysit for at least one hour to get paid.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 6, 29));
	}
}
