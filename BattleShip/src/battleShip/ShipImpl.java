package battleShip;

//import Ocean;
//import Ship;



public abstract class ShipImpl implements Ship {
    private boolean isHorizontal;
    protected int length;
    private int bowRow;
    private int bowColumn;
    protected boolean[] hit;

/*MISTAKE
    @Override
    public abstract int getLength(); // Why that one is abstract ?????????????
*/
    @Override
    public  int getLength(){
    	return length; // Guilh solution
    } 

    @Override
    public int getBowRow() {
        return bowRow;
    }

    @Override
    public int getBowColumn() {
        return bowColumn;
    }

    @Override
    public boolean isHorizontal() {
        return isHorizontal;
    }

    @Override
    public void setBowRow(int row) throws IllegalArgumentException {
        if(row>9 || row<0) {
            throw new IllegalArgumentException();
        }
        this.bowRow = row;
    }

    @Override
    public void setBowColumn(int column)throws IllegalArgumentException {
        if(column>9 || column<0) {
            throw new IllegalArgumentException();
        }
        this.bowColumn = column;
    }

    @Override
    public void setHorizontal(boolean horizontal){
        this.isHorizontal = horizontal;
    }
/* MISTAKE*****************
    @Override
    public abstract String getShipType(); // Why that one is abstract ?????????????
*/  
    @Override
    public String getShipType(){
    	return this.getClass().getSimpleName();  // Guilh solution
    }


    @Override
    public boolean okToPlaceShipAt(int row, int column, boolean hori, Ocean ocean) {
        return false;
    }

    @Override
    public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) throws IllegalArgumentException {
        setBowRow(row);
        setBowColumn(column);
        setHorizontal(horizontal);

        // extra code here for placing in ocean.
    }

    @Override
    public boolean shootAt(int row, int column) throws IllegalArgumentException {

        return false;
    }

    @Override
    public boolean isSunk() {
        for(int i = 0; i<hit.length; i++) {
            if (hit[i] = false) {
                return false;
            }
        }
        return true;
    }
}
