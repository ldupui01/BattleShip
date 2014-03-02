package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import battleShip.Destroyer;
import battleShip.Ship;

public class DestroyerTest {
	//TODO <Test> write a new test case for after the ship class has been finished, for each ship
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testGetLength() {
		//expected
		int expected = 2;
		//actual
		int actual = (new Destroyer()).getLength();
		//test
		assertEquals("length isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testGetShipType() {
		
		//expected
		String expected = "Destroyer";
		//actual
		String actual = new Destroyer().getShipType();
		//test
		assertEquals("ShipType isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testDestroyer() {
		Ship ac = new Destroyer();
		
		//test
		assertTrue(ac instanceof Ship);
	}

}
