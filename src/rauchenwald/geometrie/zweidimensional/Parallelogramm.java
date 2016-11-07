package rauchenwald.geometrie.zweidimensional;

/**
 * Created by Felix on 05/11/2016.
 */
public class Parallelogramm extends ZweiDimensional
{
    //ATTRIBUTES
    //------------------------------------------------------------------------------------------------------------------
    private int sideA;
    private int sideB;
    private double angle;
    //------------------------------------------------------------------------------------------------------------------


    //CONSTRUCTOR
    //------------------------------------------------------------------------------------------------------------------
    public Parallelogramm(int x, int y, int sideA, int sideB, int angle)
    {
        this.xKor = x;
        this.yKor = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }
    //------------------------------------------------------------------------------------------------------------------


    //GETTER SETTER
    //------------------------------------------------------------------------------------------------------------------
    public int getSideA() { return sideA; }
    public void setSideA(int sideA) { this.sideA = sideA; }
    public int getSideB() { return sideB; }
    public void setSideB(int sideB) { this.sideB = sideB; }
    public double getAngle() { return angle; }
    public void setAngle(double angle) { this.angle = angle; }
    //------------------------------------------------------------------------------------------------------------------



    //METHODS
    //------------------------------------------------------------------------------------------------------------------
    public double calculateArea()
    {
        double area = this.sideA * this.sideB * Math.sin(this.angle);
        if (area < 0) return area * -1;
        else return area;
    }
    public double calculatePerimeter() { return 2 * this.sideA + 2 * this.sideB; }
    //------------------------------------------------------------------------------------------------------------------


    //OVERRIDES
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parallelogramm that = (Parallelogramm) o;

        if (sideA != that.sideA) return false;
        if (sideB != that.sideB) return false;
        return Double.compare(that.angle, angle) == 0;

    }
    @Override
    public int hashCode()
    {
        int result;
        long temp;
        result = sideA;
        result = 31 * result + sideB;
        temp = Double.doubleToLongBits(angle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------

}
