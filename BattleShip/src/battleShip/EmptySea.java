/**
 * 
 */
package battleShip;

/**
 * @author Guilherme
 *
 */
public class EmptySea extends ShipImpl implements Ship {
	
	public EmptySea(){
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
	
	@Override
	boolean shootAt(int row, int column) {
		return false;
	}
	
	@Override
	boolean isSunk() {
		return false;
	}
	@Override 
	public String toString(){
		return "-";
	}
}
