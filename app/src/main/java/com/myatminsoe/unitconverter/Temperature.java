package com.myatminsoe.unitconverter;

/**
 * Created by myatminsoe on 12/13/15.
 */
public class Temperature {

    double f, c;

    public void setF(double f) {
        c = (f - 32) * 5/9;
        this.f = f;
    }

    public void setC(double c) {
        f = (c * 9/5) + 32;
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public double getC() {
        return c;
    }
}
