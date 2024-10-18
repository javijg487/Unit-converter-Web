package com.roadmap.proyecto2.models;

public enum WeightUnit {
    MG(0.001),
    G(1.0),
    KG(1000.0),
    OUNS(28.3495),
    POUND(453.592);

    private final double conversionFactor;

    WeightUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
