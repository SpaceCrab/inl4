package Model;

public abstract class Ship
{
    private String name;
    private int size;
    private String orientation;
    private int positionX; // ett int värde eller två? x och y kanske är lättare
    private int positionY;
    private int nbrOfHits;
    private boolean isHit = false;
    ShipType shipType;

    public Ship(int size,ShipType shipType){
        this.shipType = shipType;
        this.size = size;
    }

    public int getNbrOfHits()
    {
        return nbrOfHits;
    }

    public void setNbrOfHits(int nbrOfHits)
    {
        this.nbrOfHits = nbrOfHits;
    }

    public void setHit(boolean hit)
    {
        isHit = hit;
    }

    public boolean isHit()
    {
        return isHit;
    }

    /**
     * Getters & Setters
     * @return
     */
    public int getPositionX()
    {
        return positionX;
    }

    public void setPositionX(int positionX)
    {
        this.positionX = positionX;
    }

    public int getPositionY()
    {
        return positionY;
    }

    public void setPositionY(int positionY)
    {
        this.positionY = positionY;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }
    public String getOrientation(){
        return orientation;
    }

    public void setName(){
        this.name = name;
    }
    public void setSize(int size){
        this.size = size;
    }

    public void setOrientation(){
        this.orientation = orientation;
    }

    public String toString()
    {
       return String.format("%s ", shipType);
    }

}
