package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import battleShip.Ship;
import battleShip.Submarine;

public class SubmarineTest {
	//TODO <Test> write a new test case for after the ship class has been finished, for each ship
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testGetLength() {
		//expected
		int expected = 3;
		//actual
		int actual = (new Submarine()).getLength();
		//test
		assertEquals("length isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testGetShipType() {
		
		//expected
		String expected = "Submarine";
		//actual
		String actual = new Submarine().getShipType();
		//test
		assertEquals("ShipType isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testSubmarine() {
		Ship ac = new Submarine();
		
		//test
		assertTrue(ac instanceof Ship);
	}

}
