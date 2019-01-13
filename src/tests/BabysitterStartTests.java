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
	public void isTheBabysittersStartTimeInThePM() {
		assertEquals(0, BabysitterStart.BabysitterStartPMOrAM(0));
	}
}