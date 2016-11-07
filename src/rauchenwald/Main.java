package rauchenwald;

import rauchenwald.geometrie.dreidimensional.*;
import rauchenwald.geometrie.zweidimensional.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felix on 05/11/2016.
 */
public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.doIt();
    }

    private void doIt()
    {
        List<ZweiDimensional> twoDimList = new ArrayList<>();

        List<DreiDimensional> threeDimList = new ArrayList<>();

        fill2DimList(twoDimList);
        fill3DimList(threeDimList);


        double twoDimAreaSum = 0;
        double twoDimPerimeterSum = 0;

        for (ZweiDimensional object : twoDimList)
        {
            twoDimAreaSum += object.calculateArea();
            twoDimPerimeterSum += object.calculatePerimeter();
        }

        System.out.println("Area sum of all two dimensional objects is: " + twoDimAreaSum);
        System.out.println("Perieter sum of all two dimensional objects is: " + twoDimPerimeterSum);



        double threeDimVolumeSum = 0;
        double threeDimSurfaceSum = 0;

        for (DreiDimensional object : threeDimList)
        {
            threeDimVolumeSum += object.calculateVolume();
            threeDimSurfaceSum += object.calculateSurfaceArea();
        }

        System.out.println("Volume sum of all three dimensional objects is: " + threeDimVolumeSum);
        System.out.println("Surface area sum of all three dimensional objects is: " + threeDimSurfaceSum);
    }


    private void fill2DimList(List<ZweiDimensional> list)
    {
        list.add(new Dreieck(1,1,10,5));
        list.add(new Dreieck(1,1,5,4));
        list.add(new Dreieck(1,1,2,6));

        list.add(new Parallelogramm(1,1,10,10,80));
        list.add(new Parallelogramm(1,1,10,12,85));
        list.add(new Parallelogramm(1,1,6,8,75));

        list.add(new Raute(1, 1, 6, 80));
        list.add(new Raute(1, 1, 8, 85));
        list.add(new Raute(1, 1, 14, 75));
    }

    private void fill3DimList(List<DreiDimensional> list)
    {
        list.add(new Kegel(1, 1, 5, 8));
        list.add(new Kegel(1, 1, 8, 3));
        list.add(new Kegel(1, 1, 10, 8));

        list.add(new Würfel(1, 1, 5));
        list.add(new Würfel(1, 1, 10));
        list.add(new Würfel(1, 1, 14));

        list.add(new Zylinder(1, 1, 5, 8));
        list.add(new Zylinder(1, 1, 3, 9));
        list.add(new Zylinder(1, 1, 10, 4));
    }
}
