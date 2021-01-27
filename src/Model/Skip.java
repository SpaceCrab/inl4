package Model;

public abstract class Skip
{
    protected String name;
    protected int size;
    protected String orientation;
    protected int positionX; // ett int värde eller två? x och y kanske är lättare
    protected int positionY;

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
