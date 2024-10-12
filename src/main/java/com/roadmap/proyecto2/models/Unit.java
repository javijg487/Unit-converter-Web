package com.roadmap.proyecto2.models;


public class Unit {
    private double value;
    private String unitFrom;
    private String unitTo;

    public Unit() {
    }

    public Unit(double value, String unitFrom, String unitTo) {
        this.value = value;
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnitFrom() {
        return unitFrom;
    }

    public void setUnitFrom(String unitFrom) {
        this.unitFrom = unitFrom;
    }

    public String getUnitTo() {
        return unitTo;
    }

    public void setUnitTo(String unitTo) {
        this.unitTo = unitTo;
    }
    
}
