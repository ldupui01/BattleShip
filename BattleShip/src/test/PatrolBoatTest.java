package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import battleShip.PatrolBoat;
import battleShip.Ship;

public class PatrolBoatTest {
	//TODO <Test> write a new test case for after the ship class has been finished, for each ship
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testGetLength() {
		//expected
		int expected = 1;
		//actual
		int actual = (new PatrolBoat()).getLength();
		//test
		assertEquals("length isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testGetShipType() {
		
		//expected
		String expected = "PatrolBoat";
		//actual
		String actual = new PatrolBoat().getShipType();
		//test
		assertEquals("ShipType isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testPatrolBoat() {
		Ship ac = new PatrolBoat();
		
		//test
		assertTrue(ac instanceof Ship);
	}

}
