package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.BabysitterStart;
import main.RunBabysitterKata;

public class BabysitterStartTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isTheBabysittersStartingHour5PMOrLater_1() {
		assertEquals("5", BabysitterStart.BabysitterStartingHour(0, 5));
	}

	@Test
	public void theBabysittersStartingHourCannotBeBefore5PM_2() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingHour(0, 4));
	}

	@Test
	public void isTheBabysittersStartingHourBefore4AMOrEarlier_3() {
		assertEquals("12", BabysitterStart.BabysitterStartingHour(1, 0));
	}

	@Test
	public void theBabysittersStartingHourCannotBeAfter4AM_4() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingHour(1, 5));
	}

	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsANegativeInteger_5() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingHour(1, -2));
	}

	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsGreaterThan11PM_6() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingHour(1, 12));
	}

	@Test
	public void theBabysittersStartingHourWithAnErrorForPMOrAM_7() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingHour(2, 2));
	}

	@Test
	public void theBabysittersStartingMinute_8() {
		assertEquals("02", BabysitterStart.BabysitterStartingMinute(2));
	}

	@Test
	public void theBabysittersStartingMinuteWithOver59MinutesError_9() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingMinute(60));
	}

	@Test
	public void theBabysittersStartingMinuteWithNegativeMinutesError_10() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterStartingMinute(-5));
	}

	@Test
	public void isTheBabysittersEndingHour4AMOrEarlier_11() {
		assertEquals("16", BabysitterStart.BabysitterEndingHour(1, 4));
	}

	@Test
	public void theBabysittersEndingHourCannotBeBefore5PM_12() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingHour(0, 4));
	}

	@Test
	public void isTheBabysittersEndingHourBeforeMidnightOrEarlier_13() {
		assertEquals("10", BabysitterStart.BabysitterEndingHour(0, 10));
	}

	@Test
	public void theBabysittersEndingHourCannotBeAfter4AM_14() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingHour(1, 5));
	}

	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsANegativeInteger_15() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingHour(1, -2));
	}

	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsGreaterThan11AM_16() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingHour(1, 12));
	}

	@Test
	public void theBabysittersEndingHourWithAnErrorForPMOrAM_17() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingHour(2, 2));
	}

	@Test
	public void theBabysittersEndingMinute_18() {
		assertEquals("2", BabysitterStart.BabysitterEndingMinute(2));
	}

	@Test
	public void theBabysittersEndingMinuteWithOver59MinutesError_19() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingMinute(60));
	}

	@Test
	public void theBabysittersEndingMinuteWithNegativeMinutesError_20() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterEndingMinute(-5));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsNotBeforeStartingTime_21() {
		assertEquals("495", BabysitterStart.BabysitterTotalMinutesBabysitting("5", "30", "13", "45"));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsSameAsStartingTime_22() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterTotalMinutesBabysitting("5", "30", "5", "30"));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsBeforeStartingTime_23() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterTotalMinutesBabysitting("5", "30", "5", "15"));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsLessThan60MinutesBeforeStartingTime_24() {
		assertEquals("an Error.  Try again.", BabysitterStart.BabysitterTotalMinutesBabysitting("5", "30", "6", "29"));
	}

	@Test
	public void verifyTheBabysittersName_25() {
		String nameOfSitter = "Barb";
		assertEquals("Barb", nameOfSitter);
	}

}
