package rauchenwald.geometrie.zweidimensional;

/**
 * Created by Felix on 05/11/2016.
 */
public class Raute extends ZweiDimensional
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private int sideA;
    private int angleA;
    //------------------------------------------------------------------------------------------------------------------


    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    public Raute(int x, int y, int sideA, int angleA)
    {
        this.xKor = x;
        this.yKor = y;
        this.sideA = sideA;
        this.angleA = angleA;
    }
    //------------------------------------------------------------------------------------------------------------------


    //GETTER SETTER
    //------------------------------------------------------------------------------------------------------------------

    public int getSideA() { return sideA; }
    public void setSideA(int sideA) { this.sideA = sideA; }
    public int getAngleA() { return angleA; }
    public void setAngleA(int angleA) { this.angleA = angleA; }
    //------------------------------------------------------------------------------------------------------------------



    //METHODS
    //------------------------------------------------------------------------------------------------------------------
    public double calculateArea()
    {
        double area = Math.pow(this.sideA, 2) * Math.sin(angleA);
        if (area < 0) return area * -1;
        else return area;
    }
    public double calculatePerimeter() { return 4 * this.sideA; }
    //------------------------------------------------------------------------------------------------------------------


    //OVERRIDE
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raute raute = (Raute) o;

        if (sideA != raute.sideA) return false;
        return angleA == raute.angleA;

    }
    @Override
    public int hashCode()
    {
        int result = sideA;
        result = 31 * result + angleA;
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------

}
