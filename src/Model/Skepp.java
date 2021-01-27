package Model;

public abstract class Skepp
{
    protected String name;
    protected int size;
    protected String orientation;
    protected int position; // ett int värde eller två? x och kanske är lättare

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
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
