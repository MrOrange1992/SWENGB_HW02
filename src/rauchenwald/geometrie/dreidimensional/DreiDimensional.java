package rauchenwald.geometrie.dreidimensional;

import rauchenwald.geometrie.GeometrieObjekt;

/**
 * Created by Felix on 05/11/2016.
 */
public abstract class DreiDimensional extends GeometrieObjekt
{
    protected int surfaces;

    public int getSurfaces() { return surfaces; }

    public void setSurfaces(int surfaces) { this.surfaces = surfaces; }

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}
