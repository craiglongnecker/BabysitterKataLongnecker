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
	public void isBabysittersNameJulie() {
		assertEquals("Julie", BabysitterStart.BabysitterName("Julie"));
	}
	
	@Test
	public void whatIsBabysittersName() {
		assertEquals("Barb", BabysitterStart.BabysitterName("Barb"));
	}
	
	@Test
	public void isTheBabysittersStartingHour5PMOrLater() {
		assertEquals("5", BabysitterStart.BabysitterStartingHour(0, 5));
	}

	@Test
	public void theBabysittersStartingHourCannotBeBefore5PM() {
		assertEquals("You cannot start babysitting before 5:00 PM.", BabysitterStart.BabysitterStartingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersStartingHourBefore4AMOrEarlier() {
		assertEquals("12", BabysitterStart.BabysitterStartingHour(1, 0));
	}
	
	@Test
	public void theBabysittersStartingHourCannotBeAfter4AM() {
		assertEquals("You cannot start babysitting after 4:00 AM.", BabysitterStart.BabysitterStartingHour(1, 5));
	}
	
	@Test
	public void theBabysittersStartingHourWhenAnErrorForHourIsANegativeInteger() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, -2));
	}
	
	@Test
	public void theBabysittersStartingHourWHenAnErrorForHourIsGreaterThan11() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(1, 12));
	}

	@Test
	public void theBabysittersStartingHourWithAnErrorForPMOrAM() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingHour(2, 2));
	}

	@Test
	public void theBabysittersStartingMinute() {
		assertEquals("02", BabysitterStart.BabysitterStartingMinute(2));
	}

	@Test
	public void theBabysittersStartingMinuteWithOver59MinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(60));
	}

	@Test
	public void theBabysittersStartingMinuteWithNegativeMinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(-5));
	}
	
	@Test
	public void isTheBabysittersEndingHour4AMOrEarlier() {
		assertEquals("16", BabysitterStart.BabysitterEndingHour(1, 4));
	}

	@Test
	public void theBabysittersEndingHourCannotBeBefore5PM() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(0, 4));
	}
	
	@Test
	public void isTheBabysittersEndingHourBeforeMidnightOrEarlier() {
		assertEquals("10", BabysitterStart.BabysitterEndingHour(0, 10));
	}
	
	@Test
	public void theBabysittersEndingHourCannotBeAfter4AM() {
		assertEquals("You cannot end babysitting during this time.", BabysitterStart.BabysitterEndingHour(1, 5));
	}
	
	@Test
	public void theBabysittersEndingHourWhenAnErrorForHourIsANegativeInteger() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, -2));
	}
	
	@Test
	public void theBabysittersEndingHourWHenAnErrorForHourIsGreaterThan11() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(1, 12));
	}

	@Test
	public void theBabysittersEndingHourWithAnErrorForPMOrAM() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingHour(2, 2));
	}

	@Test
	public void theBabysittersEndingMinute() {
		assertEquals("2", BabysitterStart.BabysitterEndingMinute(2));
	}

	@Test
	public void theBabysittersEndingMinuteWithOver59MinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(60));
	}

	@Test
	public void theBabysittersEndingMinuteWithNegativeMinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterEndingMinute(-5));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsNotBeforeStartingTime() {
		assertEquals("495", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 13, 45));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsSameAsOrBeforeStartingTime() {
		assertEquals("Error. Babysitting ending time cannot be the same as or before the starting time.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 5, 30));
	}

	@Test
	public void verifyTheBabysittersEndingTimeIsLessThan60MinutesBeforeStartingTime() {
		assertEquals("You must babysit for at least one hour to get paid.", BabysitterStart.BabysitterTotalMinutesBabysitting(5, 30, 6, 29));
	}

}
