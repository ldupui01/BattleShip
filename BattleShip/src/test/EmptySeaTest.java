package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import battleShip.EmptySea;
import battleShip.Ship;

public class EmptySeaTest {
	//TODO <Test> write a new test case for after the ship class has been finished, for each ship
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testGetLength() {
		//expected
		int expected = 1;
		//actual
		int actual = (new EmptySea()).getLength();
		//test
		assertEquals("length isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testGetShipType() {
		
		//expected
		String expected = "EmptySea";
		//actual
		String actual = new EmptySea().getShipType();
		//test
		assertEquals("ShipType isn't set up propperly for Aircraft Carrier",expected,actual);	
	}

	@Test
	public final void testEmptySea() {
		Ship ac = new EmptySea();
		
		//test
		assertTrue(ac instanceof Ship);
	}
	@Test
	public final void testShootAt(){
		EmptySea es = new EmptySea();
		assertFalse(es.shootAt(1,5));
	}
	@Test
	public final void testIsSunk(){
		EmptySea es = new EmptySea();
		assertFalse(es.isSunk());
	}
	@Test
	public final void testToString(){
		EmptySea es = new EmptySea();
		assertEquals("toString() not working as expected","-",es.toString());
	}

}
