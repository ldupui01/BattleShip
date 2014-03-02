/**
 * 
 */
package battleShip;

import battleShip.Ship;

/**
 * @author Guilherme
 *
 */
public class Destroyer extends ShipImpl implements Ship {
	
	public Destroyer(){
		this.length = 2;
		this.hit = new int[length];
	}

	/* (non-Javadoc)
	 * @see battleShip.Ship#getLength()
	 */
	@Override
	int getLength() {//could be part of the abstract class too.
		// TODO Auto-generated method stub
		return length;
	}

	/* (non-Javadoc)
	 * @see battleShip.Ship#getShipType()
	 */
	@Override
	String getShipType() {//could be part of the abstract class too.
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
