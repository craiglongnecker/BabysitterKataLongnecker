package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.BabysitterStart;

public class BabysitterStartTests {

	private static final Object Int = null;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isBabysittersNameJulie1() {
		assertEquals("Julie", BabysitterStart.BabysitterName("Julie"));
	}
	
	@Test
	public void whatIsBabysittersName2() {
		assertEquals("Barb", BabysitterStart.BabysitterName("Barb"));
	}
	
	@Test
	public void isTheBabysittersStartingHour5PMOrLater3() {
		assertEquals("5", BabysitterStart.BabysitterStartingHour(0, 5));
	}

	@Test
	public void theBabysittersStartingHourCannotBeBefore5PM4() {
		assertEquals("You cannot start babysitting before 5:00 PM.", BabysitterStart.BabysitterStartingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersStartingHourBefore4AMOrEarlier5() {
		assertEquals("12", BabysitterStart.BabysitterStartingHour(1, 0));
	}
	
	@Test
	public void theBabysittersStartingHourCannotBeAfter4AM6() {
		assertEquals("You cannot start babysitting after 4:00 AM.", BabysitterStart.BabysitterStartingHour(1, 5));
	}
	
	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsANegativeInteger7() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, -2));
	}
	
	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsGreaterThan11PM8() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, 12));
	}

	@Test
	public void theBabysittersStartingHourWithAnErrorForPMOrAM9() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(2, 2));
	}

	@Test
	public void theBabysittersStartingMinute10() {
		assertEquals("02", BabysitterStart.BabysitterStartingMinute(2));
	}

	@Test
	public void theBabysittersStartingMinuteWithOver59MinutesError11() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(60));
	}

	@Test
	public void theBabysittersStartingMinuteWithNegativeMinutesError12() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(-5));
	}
	
	@Test
	public void isTheBabysittersEndingHour4AMOrEarlier13() {
		assertEquals("16", BabysitterStart.BabysitterEndingHour(1, 4));
	}

	@Test
	public void theBabysittersEndingHourCannotBeBefore5PM14() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersEndingHourBeforeMidnightOrEarlier15() {
		assertEquals("10", BabysitterStart.BabysitterEndingHour(0, 10));
	}
	
	@Test
	public void theBabysittersEndingHourCannotBeAfter4AM16() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(1, 5));
	}
	
	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsANegativeInteger17() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, -2));
	}
	
	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsGreaterThan11AM18() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, 12));
	}

	@Test
	public void theBabysittersEndingHourWithAnErrorForPMOrAM19() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(2, 2));
	}

	@Test
	public void theBabysittersEndingMinute20() {
		assertEquals("2", BabysitterStart.BabysitterEndingMinute(2));
	}

	@Test
	public void theBabysittersEndingMinuteWithOver59MinutesError21() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(60));
	}

	@Test
	public void theBabysittersEndingMinuteWithNegativeMinutesError22() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(-5));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsNotBeforeStartingTime23() {
		assertEquals("495", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 13, 45));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsSameAsOrBeforeStartingTime24() {
		assertEquals("Error. Babysitting ending time cannot be the same as or before the starting time.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 5, 30));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsLessThan60MinutesBeforeStartingTime25() {
		assertEquals("You must babysit for at least one hour to get paid.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 6, 29));
	}

}
