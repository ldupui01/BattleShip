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
		//this.hit = new int[length];
	}

	
	@Override
	public boolean shootAt(int row, int column) {
		return false;
	}
	
	@Override
	public boolean isSunk() {
		return false;
	}
	@Override 
	public String toString(){
		return "-";
	}
}
