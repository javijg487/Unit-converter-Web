package com.roadmap.proyecto2.models;

public enum TemperatureUnit {
    C(),
    F(),
    K();

    public double convertTo(TemperatureUnit toUnit, TemperatureUnit fromUnit, double value) {
        if (fromUnit == toUnit) {
            return value;
        } else if (fromUnit == C && toUnit == F) {
            return (value * 9 / 5) + 32;
        } else if (fromUnit == F && toUnit == C) {
            return (value - 32) * 5 / 9;
        } else if (fromUnit == C && toUnit == K) {
            return value + 273.15;
        } else if (fromUnit == K && toUnit == C) {
            return value - 273.15;
        } else if (fromUnit == F && toUnit == K) {
            return (value - 32) * 5 / 9 + 273.15;
        } else if (fromUnit == K && toUnit == F) {
            return (value - 273.15) * 9 / 5 + 32;
        }
        throw new IllegalArgumentException("Conversion not supported between " + fromUnit + " and " + toUnit);
    }
}
