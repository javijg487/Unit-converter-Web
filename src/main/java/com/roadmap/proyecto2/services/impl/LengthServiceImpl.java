package com.roadmap.proyecto2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadmap.proyecto2.converters.UnitConverter;
import com.roadmap.proyecto2.models.LengthUnit;
import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;
import com.roadmap.proyecto2.services.LengthService;

@Service
public class LengthServiceImpl implements LengthService {

    @Autowired
    UnitConverter unitConverter;

    @Override
    public UnitResultDTO convertLength(Unit unit) {
        UnitResultDTO result = unitConverter.toUnitResultDTO(unit);
        try {
            if (!unit.getUnitFrom().equalsIgnoreCase("m")) {
                LengthUnit lengthUnitFrom = LengthUnit.valueOf(unit.getUnitFrom().toUpperCase());
                unit.setValue(unit.getValue() * lengthUnitFrom.getConversionFactor());
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unidad de longitud inválida: " + unit.getUnitFrom());
        }
        try {
            LengthUnit lengthUnitTo = LengthUnit.valueOf(unit.getUnitTo().toUpperCase());
            result.setResult(unit.getValue() / lengthUnitTo.getConversionFactor());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unidad de longitud inválida: " + unit.getUnitTo());
        }
        return result;
    }
}
