package battleShip;
/**
 * @author Ludo
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class OceanImpl implements Ocean {
	private Ship[][] shipArray;
	private int shotFired;
	private int hitCount;
	private int shipSunk;
	private String ocean;
	private String[][] oceanGrid;
	private List<Ship> fleet;

	public OceanImpl(){
		//Create an empty ocean fills the ship  array with EmptySeas.
		// Also initialises game variables such as how many shots have been fired.
		this.initOcean();
		this.initShipArray();
		shotFired = 0;
		hitCount = 0;
		shipSunk = 0;
		fleet = new ArrayList<Ship>();
		this.admiral();
	}
	
	private void admiral(){
		//Setting the fleet
		// **************** would be better as a factory !!!!!!!!! ******************************
		Ship carrier = new AircraftCarrier();
		fleet.add(carrier);
		Ship battleship1 = new Battleship();
		fleet.add(battleship1);
		Ship battleship2 = new Battleship();
		fleet.add(battleship2);
		Ship submarine1 = new Submarine();
		fleet.add(submarine1);
		Ship submarine2 = new Submarine();
		fleet.add(submarine2);
		Ship destroyer1 = new Destroyer();
		fleet.add(destroyer1);
		Ship destroyer2 = new Destroyer();
		fleet.add(destroyer2);
		Ship patrol1 = new PatrolBoat();
		fleet.add(patrol1);
		Ship patrol2 = new PatrolBoat();
		fleet.add(patrol2);
		Ship patrol3 = new PatrolBoat();
		fleet.add(patrol3);
		Ship patrol4 = new PatrolBoat();
		fleet.add(patrol4);
	}
	
	public void placeAllShipsRandomly(){
		//place all the ships randomly on the initially empty ocean.
		//Place larger ships before smaller ones to avoid "no legal move"
		//Use Random class Java.util
		
		
		
	}
	
	public boolean isOccupied(int row, int column){
		//returns True if the given location contains a ship, false if not
		return false;
	}
	
	public boolean shootAt(int row, int coloumn){
		//returns True if given location contains a ship still afloat, false if it does not
		//returns True if several shot fired at the same location as long as the ship is afloat, false otherwise
		//update the number of shot fired
		shotFired++;
		
		
		return false;
	}
	
	public int getShotsFired(){
		//returns the number of shot fired
		return shotFired;
	}
	
	public int getHitCount(){
		//returns the number of hit recorded (even several shot at the same place)
		return hitCount;
	}
	
	public int getShipsSunk(){
		//returns the number of ship sunk;
		return shipSunk;
	}
	
	public boolean isGameOver(){
		//return true if all ships have been sunk
		return false;
	}
	
	public Ship[][] getShipArray(){
		//returns the grid of ship
		return shipArray;
	}
	
	@Override
	public String toString(){
		//return the string representing the ocean
		// row number on the left from 0 to 9
		// column number on the top from 0 to 9
		// S: hit on ship
		// -: hit on water
		// x: sunken ship
		// .: location that has not been fired at
		
		return ocean;
	}
	
	private void initOcean(){
		oceanGrid = new String[9][9];
		for(int i = 0; i<9;i++){
			for (int j=0;j<10;j++)
				oceanGrid[i][j]=".";
		}
	}
	
	private void initShipArray(){
		Ship es = new EmptySea();
		for(int i = 0; i<9;i++){
			for (int j=0;j<10;j++)
				this.shipArray[i][j]= es;
		}
	}
}
