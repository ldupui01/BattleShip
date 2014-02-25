package battleShip;

public interface Ocean {

	/*
	 * place all the ships randomly on the initially empty ocean.
	 * Place larger ships before smaller ones to avoid "no legal move"
	 * Use Random class Java.util
	 */
	 void placeAllShipsRandomly();
		
	/*returns true if the given location contains a ship, false if not
	 * 
	 */
	boolean isOccupied(int row, int column);
	 
	/*
	 * returns True if given location contains a ship still afloat, false if it does not
	 * returns True if several shot fired at the same location as long as the ship is afloat, false otherwise
	 * update the number of shot fired
	*/
	 boolean shootAt(int row, int coloumn);

	/*
	 * return the number of shot fired
	 */
	 int getShotsFired();
	 
	/*
	 * returns the number of hit recorded (even several shot at the same place)
	 */
	int getHitCount();
	
	/*
	 * returns the number of ship sunk 
	 */
	int getShipsSunk();
	
	/*return true if all ships have been sunk
	 * 
	 */
	boolean isGameOver();
	
	/*
	 * returns the grid of ship 
	 */
	Ship[][] getShipArray();
	
	/*
	 * return the string representing the ocean
	 * row number on the left from 0 to 9
	 * column number on top from 0 to 9
	 * S: hit on ship
	 * -: hit on water
	 * x: sunken ship
	 * .: location that has not been fired at
	*/
	@Override
	 String toString();
}
