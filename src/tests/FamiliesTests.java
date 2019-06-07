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
	}

}
