package Model;

public abstract class Ship
{
    private String name;
    private int size;
    private String orientation;
    private int positionX; // ett int värde eller två? x och y kanske är lättare
    private int positionY;
    ShipType shipType;

    public Ship(int size,ShipType shipType){
        this.shipType = shipType;
        this.size = size;
    }
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
    public void setSize(){
        this.size = size;
    }

    public void setOrientation(){
        this.orientation = orientation;
    }

}
