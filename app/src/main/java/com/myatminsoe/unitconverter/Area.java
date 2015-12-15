package com.myatminsoe.unitconverter;

/**
 * Created by myatminsoe on 12/14/15.
 */
public class Area {

    private double m2, km2, in2, ft2, mile2, hectare, acre;

    private void convert() {
        km2 = m2 / 100000;
        in2 = m2 * 1550;
        ft2 = in2 / 144;
        mile2 = ft2 / (5280 * 5280);
        hectare = m2 / 10000;
        acre = ft2 / 43560;
    }

    public void setM2(double m2) {
        this.m2 = m2;
        convert();
    }

    public void setKm2(double km2) {
        m2 = km2 * 100000;
        convert();
    }

    public void setIn2(double in2) {
        m2 = in2 / 1550;
        convert();
    }

    public void setFt2(double ft2) {
        m2 = (ft2 * 144) / 1550;
        convert();
    }

    public void setMile2(double mile2) {
        m2 = mile2 * 5280 * 5280 * 144 / 1550;
        convert();
    }

    public void setHectare(double hectare) {
        m2 = hectare * 10000;
        convert();
    }

    public void setAcre(double acre) {
        m2 = acre * 4046.87;
        convert();
    }

    public double getM2() {
        return m2;
    }

    public double getKm2() {
        return km2;
    }

    public double getIn2() {
        return in2;
    }

    public double getFt2() {
        return ft2;
    }

    public double getMile2() {
        return mile2;
    }

    public double getHectare() {
        return hectare;
    }

    public double getAcre() {
        return acre;
    }
}
