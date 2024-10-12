package com.roadmap.proyecto2.models;

public enum LengthUnit {
    MM(0.001),
    CM(0.01),
    M(1.0),
    KM(1000.0),
    IN(0.0254),
    FT(0.3048),
    YD(0.9144),
    MI(1609.344);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
