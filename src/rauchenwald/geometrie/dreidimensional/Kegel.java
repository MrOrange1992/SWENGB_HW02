package rauchenwald.geometrie.dreidimensional;

/**
 * Created by Felix on 05/11/2016.
 */
public class Kegel extends DreiDimensional
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private int radius;
    private int height;
    //------------------------------------------------------------------------------------------------------------------


    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    public Kegel(int x, int y, int radius, int height)
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
    public double calculateVolume() { return 1 / 3 * Math.PI * Math.pow(this.radius, 2) * this.height; }

    public double calculateSurfaceArea()
    {
        return Math.PI * Math.pow(this.radius, 2) +
                Math.PI * this.radius * Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2));
    }
    //------------------------------------------------------------------------------------------------------------------


    //OVERRIDES
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kegel kegel = (Kegel) o;

        if (radius != kegel.radius) return false;
        return height == kegel.height;

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
