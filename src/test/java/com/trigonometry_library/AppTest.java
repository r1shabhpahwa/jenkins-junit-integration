package com.trigonometry_library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// import com.trigonometry_library.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();
    double delta = 0.0001;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isSinEqualForZero()
    {
        double x = 0;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }

    @Test
    public void isSinEqualForFirstQuadrant()
    {
        double x = Math.PI/4;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }

    @Test
    public void isSinEqualForSecondQuadrant()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }

    @Test
    public void isSinEqualForThirdQuadrant()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }
    @Test
    public void isSinEqualForFourthQuadrant()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }
    @Test
    public void isSinEqualForNegativeInfinity()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }
    @Test
    public void isSinEqualForPositiveInfinity()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }
    @Test
    public void isSinEqualForNaN()
    {
        double x = Double.NaN;
        assertEquals(Math.sin(x), app.sin(x), delta);
    }


    @Test
    public void isCosEqualForZero()
    {
        double x = 0;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }

    @Test
    public void isCosEqualForFirstQuadrant()
    {
        double x = Math.PI/4;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }

    @Test
    public void isCosEqualForSecondQuadrant()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }

    @Test
    public void isCosEqualForThirdQuadrant()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }
    @Test
    public void isCosEqualForFourthQuadrant()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }
    @Test
    public void isCosEqualForNegativeInfinity()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }
    @Test
    public void isCosEqualForPositiveInfinity()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }
    @Test
    public void isCosEqualForNaN()
    {
        double x = Double.NaN;
        assertEquals(Math.cos(x), app.cos(x), delta);
    }



    @Test
    public void isTanEqualForZero()
    {
        double x = 0;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }

    @Test
    public void isTanEqualForFirstQuadrant()
    {
        double x = Math.PI/4;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }

    @Test
    public void isTanEqualForSecondQuadrant()
    {
        double x = 3*Math.PI/4;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }

    @Test
    public void isTanEqualForThirdQuadrant()
    {
        double x = 5*Math.PI/4;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }
    
    @Test
    public void isTanEqualForFourthQuadrant()
    {
        double x = 7*Math.PI/4;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }

    @Test
    public void isTanEqualFor90Degrees()
    {
        double x = Math.PI/2;
        System.out.println("lol tan90:" + Math.tan(x));
        assertEquals(Math.tan(x), app.tan(x), delta);
    }
    @Test
    public void isTanEqualForNegativeInfinity()
    {
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }
    @Test
    public void isTanEqualForPositiveInfinity()
    {
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }
    @Test
    public void isTanEqualForNaN()
    {
        double x = Double.NaN;
        assertEquals(Math.tan(x), app.tan(x), delta);
    }
}
