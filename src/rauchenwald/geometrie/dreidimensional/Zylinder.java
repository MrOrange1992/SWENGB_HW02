package rauchenwald.geometrie.dreidimensional;

/**
 * Created by Felix on 05/11/2016.
 */
public class Zylinder extends DreiDimensional
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private int radius;
    private int height;
    //------------------------------------------------------------------------------------------------------------------



    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    public Zylinder(int x, int y, int radius, int height)
    {
        this.xKor = x;
        this.yKor = y;
        this.radius = radius;
        this.height = height;
    }
    //------------------------------------------------------------------------------------------------------------------



    //GETTER SETTER
    //------------------------------------------------------------------------------------------------------------------
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    //------------------------------------------------------------------------------------------------------------------



    //METHODS
    //------------------------------------------------------------------------------------------------------------------
    public double calculateVolume() { return Math.pow(this.radius, 2) * Math.PI * this.height; }

    public double calculateSurfaceArea() { return 2 * Math.pow(this.radius, 2) * Math.PI
            + 2 * Math.PI * this.radius * this.height; }
    //------------------------------------------------------------------------------------------------------------------



    //OVERRIDES
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zylinder zylinder = (Zylinder) o;

        if (radius != zylinder.radius) return false;
        return height == zylinder.height;
    }
    @Override
    public int hashCode()
    {
        int result = radius;
        result = 31 * result + height;
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------

}
