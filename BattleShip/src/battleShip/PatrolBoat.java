/**
 * 
 */
package battleShip;

/**
 * @author Guilherme
 *
 */
public class PatrolBoat extends ShipImpl implements Ship {
	
	public PatrolBoat(){
		this.length = 1;
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
