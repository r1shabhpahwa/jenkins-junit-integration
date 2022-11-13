package com.trigonometry_library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// import com.trigonometry_library.App;

/**
 * Unit test for simple App.
 */
public class TrigonometryLibraryTest 
{
    double delta = 0.01;

    @Test
    public void checkSinForZeroRadian()
    {
        double x = 0;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }

    @Test
    public void checkSinForFirstQuadrantRadian()
    {
        double x = Math.PI/4;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }

    @Test
    public void checkSinForSecondQuadrantRadian()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }

    @Test
    public void checkSinForThirdQuadrantRadian()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }
    @Test
    public void checkSinForFourthQuadrantRadian()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }
    @Test
    public void checkSinForNegativeInfinityRadian()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }
    @Test
    public void checkSinForPositiveInfinityRadian()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }
    @Test
    public void checkSinForNaNRadian()
    {
        double x = Double.NaN;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, false), delta);
    }
    @Test
    public void checkSinForLargeAngleRadian()
    {
        double x = 10000;
        assertEquals(Math.sin(x), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForZeroDegree()
    {
        double x = 0;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }

    @Test
    public void checkSinForFirstQuadrantDegree()
    {
        double x = 45;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }

    @Test
    public void checkSinForSecondQuadrantDegree()
    {
        double x = 120;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }

    @Test
    public void checkSinForThirdQuadrantDegree()
    {
        double x = 240;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForFourthQuadrantDegree()
    {
        double x = 320;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForNegativeInfinityDegree()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForPositiveInfinityDegree()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForNaNDegree()
    {
        double x = Double.NaN;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }
    @Test
    public void checkSinForLargeAngleDegree()
    {
        double x = 10000;
        assertEquals(Math.sin(Math.toRadians(x)), TrigonometryLibrary.sin(x, true), delta);
    }


    @Test
    public void checkCosForZeroRadian()
    {
        double x = 0;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }

    @Test
    public void checkCosForFirstQuadrantRadian()
    {
        double x = Math.PI/4;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }

    @Test
    public void checkCosForSecondQuadrantRadian()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }

    @Test
    public void checkCosForThirdQuadrantRadian()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForFourthQuadrantRadian()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForNegativeInfinityRadian()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForPositiveInfinityRadian()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForNaNRadian()
    {
        double x = Double.NaN;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForLargeAngleRadian()
    {
        double x = 10000;
        assertEquals(Math.cos(x), TrigonometryLibrary.cos(x, false), delta);
    }
    @Test
    public void checkCosForZeroDegree()
    {
        double x = 0;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }

    @Test
    public void checkCosForFirstQuadrantDegree()
    {
        double x = 45;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }

    @Test
    public void checkCosForSecondQuadrantDegree()
    {
        double x = 120;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }

    @Test
    public void checkCosForThirdQuadrantDegree()
    {
        double x = 240;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }
    @Test
    public void checkCosForFourthQuadrantDegree()
    {
        double x = 320;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }
    @Test
    public void checkCosForNegativeInfinityDegree()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }
    @Test
    public void checkCosForPositiveInfinityDegree()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }
    @Test
    public void checkCosForNaNDegree()
    {
        double x = Double.NaN;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, true), delta);
    }
    @Test
    public void checkCosForLargeAngleDegree()
    {
        double x = 10000;
        assertEquals(Math.cos(Math.toRadians(x)), TrigonometryLibrary.cos(x, false), delta);
    }



    @Test
    public void checkTanForZeroRadian()
    {
        double x = 0;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }

    @Test
    public void checkTanForFirstQuadrantRadian()
    {
        double x = Math.PI/4;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }

    @Test
    public void checkTanForSecondQuadrantRadian()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }

    @Test
    public void checkTanForThirdQuadrantRadian()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    
    @Test
    public void checkTanForFourthQuadrantRadian()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }

    @Test
    public void checkTanFor90DegreesRadian()
    {
        double x = Math.PI/2;
        System.out.println("lol tan90:" + Math.tan(x));
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    @Test
    public void checkTanForNegativeInfinityRadian()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    @Test
    public void checkTanForPositiveInfinityRadian()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    @Test
    public void checkTanForNaNRadian()
    {
        double x = Double.NaN;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    @Test
    public void checkTanForLargeAngleRadian()
    {
        double x = 10000;
        assertEquals(Math.tan(x), TrigonometryLibrary.tan(x, false), delta);
    }
    @Test
    public void checkTanForZeroDegree()
    {
        double x = 0;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }

    @Test
    public void checkTanForFirstQuadrantDegree()
    {
        double x = 45;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }

    @Test
    public void checkTanForSecondQuadrantDegree()
    {
        double x = 120;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }

    @Test
    public void checkTanForThirdQuadrantDegree()
    {
        double x = 240;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
    
    @Test
    public void checkTanForFourthQuadrantDegree()
    {
        double x = 320;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }

    @Test
    public void checkTanFor90DegreesDegree()
    {
        double x = 90;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
    @Test
    public void checkTanForNegativeInfinityDegree()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
    @Test
    public void checkTanForPositiveInfinityDegree()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
    @Test
    public void checkTanForNaNDegree()
    {
        double x = Double.NaN;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
    @Test
    public void checkTanForLargeAngleDegree()
    {
        double x = 10000;
        assertEquals(Math.tan(Math.toRadians(x)), TrigonometryLibrary.tan(x, true), delta);
    }
}
