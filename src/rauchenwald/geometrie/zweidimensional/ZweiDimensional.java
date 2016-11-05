package rauchenwald.geometrie.zweidimensional;

import rauchenwald.geometrie.GeometrieObjekt;

/**
 * Created by Felix on 05/11/2016.
 */
public abstract class ZweiDimensional extends GeometrieObjekt
{
    protected int sides;

    public int getSides() { return sides; }

    public void setSides(int sides) { this.sides = sides; }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
