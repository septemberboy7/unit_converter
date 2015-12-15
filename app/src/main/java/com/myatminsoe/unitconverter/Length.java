package com.myatminsoe.unitconverter;

/**
 * Created by myatminsoe on 12/6/15.
 */
public class Length {

    private double m = 0, km = 0, in = 0, ft = 0, mile = 0;

    private void calcualte() {
        km = m/1000;
        in = m * 39.3701;
        ft = in/12;
        mile = ft/5280;
    }

    public void setM(double m) {
        this.m = m;
        calcualte();
    }

    public void setKm(double km) {
        this.m = km * 1000;
        calcualte();
    }

    public void setIn(double in) {
        this.m = in/39.3701;
        calcualte();
    }

    public void setFt(double ft) {
        this.m = ft * 12 / 39.3701;
        calcualte();
    }

    public void setMile(double mile) {
        this.m = mile * 5280 * 12 / 39.3701;
        calcualte();
    }

    public double getM() {
        return m;
    }

    public double getKm() {
        return km;
    }

    public double getIn() {
        return in;
    }

    public double getFt() {
        return ft;
    }

    public double getMile() {
        return mile;
    }
}
