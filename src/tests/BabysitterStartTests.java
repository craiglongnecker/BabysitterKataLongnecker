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
		assertEquals("2", BabysitterStart.BabysitterStartingMinute(2));
	}

	@Test
	public void theBabysittersStartingMinuteWithOver59MinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(60));
	}

	@Test
	public void theBabysittersStartingMinuteWithNegativeMinutesError() {
		assertEquals("Error.", BabysitterStart.BabysitterStartingMinute(-5));
	}

}
