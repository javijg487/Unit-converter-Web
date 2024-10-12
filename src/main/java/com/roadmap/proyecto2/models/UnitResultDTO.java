package com.roadmap.proyecto2.models;

public class UnitResultDTO {
    private String unitFrom;
    private String unitTo;
    private double valueFrom;
    private double result;
    

    public UnitResultDTO() {
    }

    public UnitResultDTO(String unitFrom, String unitTo, double valueFrom, double result) {
        this.unitFrom = unitFrom;
        this.unitTo = unitTo;
        this.valueFrom = valueFrom;
        this.result = result;
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

    public double getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(double valueFrom) {
        this.valueFrom = valueFrom;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
