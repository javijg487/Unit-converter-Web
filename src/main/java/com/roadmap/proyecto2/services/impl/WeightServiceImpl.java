package com.roadmap.proyecto2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadmap.proyecto2.converters.UnitConverter;
import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;
import com.roadmap.proyecto2.models.WeightUnit;
import com.roadmap.proyecto2.services.WeightService;

@Service
public class WeightServiceImpl implements WeightService {

    @Autowired
    UnitConverter unitConverter;

    @Override
    public UnitResultDTO convertWeight(Unit unit) {
        UnitResultDTO result = unitConverter.toUnitResultDTO(unit);
        try {
            if (!unit.getUnitFrom().equalsIgnoreCase("G")) {
                WeightUnit weightUnitFrom = WeightUnit.valueOf(unit.getUnitFrom().toUpperCase());
                unit.setValue(unit.getValue() * weightUnitFrom.getConversionFactor());
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unidad de peso inválida: " + unit.getUnitFrom());
        }
        try {

            WeightUnit weightUnitTo = WeightUnit.valueOf(unit.getUnitTo().toUpperCase());
            result.setResult(unit.getValue() / weightUnitTo.getConversionFactor());
            
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unidad de peso inválida: " + unit.getUnitTo());
        }
        return result;
    }
}
