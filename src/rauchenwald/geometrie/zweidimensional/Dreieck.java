package rauchenwald.geometrie.zweidimensional;

/**
 * Created by Felix on 05/11/2016.
 */
public class Dreieck extends ZweiDimensional
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private int sideA;
    private int sideB;
    //------------------------------------------------------------------------------------------------------------------



    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    //public Dreieck() {}
    public Dreieck(int x, int y, int sideA, int sideB)
    {
        this.xKor = x;
        this.yKor = y;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    //------------------------------------------------------------------------------------------------------------------



    //GETTER SETTER
    //------------------------------------------------------------------------------------------------------------------
    public int getSideA() { return sideA; }
    public void setSideA(int sideA) { this.sideA = sideA; }
    public int getSideB() { return sideB; }
    public void setSideB(int sideB) { this.sideB = sideB; }
    //------------------------------------------------------------------------------------------------------------------



    //METHODS
    //------------------------------------------------------------------------------------------------------------------
    public double calculateArea() { return this.sideA * this.sideB / 2; }

    public double calculatePerimeter()
    {
        return this.sideA + this.sideB + Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
    }
    //------------------------------------------------------------------------------------------------------------------



    //OVERRIDES
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dreieck dreieck = (Dreieck) o;

        if (sideA != dreieck.sideA) return false;
        return sideB == dreieck.sideB;

    }
    @Override
    public int hashCode()
    {
        int result = sideA;
        result = 31 * result + sideB;
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------

}
