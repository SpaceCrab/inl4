package Model;

public class Square
{
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    private int x;

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    private int y;

    public boolean hasShip()
    {
        return hasShip;
    }

    public void setHasShip(boolean hasShip)
    {
        this.hasShip = hasShip;
    }

    private boolean hasShip;

    public boolean isHit()
    {
        return isHit;
    }

    public void setHit(boolean hit)
    {
        isHit = hit;
    }

    private boolean isHit;
}
