package com.roadmap.proyecto2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadmap.proyecto2.converters.UnitConverter;
import com.roadmap.proyecto2.models.TemperatureUnit;
import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;
import com.roadmap.proyecto2.services.TemperatureService;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    UnitConverter unitConverter;

    @Override
    public UnitResultDTO convertTemperature(Unit unit) {
        UnitResultDTO result = unitConverter.toUnitResultDTO(unit);

        try {
            TemperatureUnit temperatureUnitTo = TemperatureUnit.valueOf(unit.getUnitTo().toUpperCase());
            TemperatureUnit temperatureUnitFrom = TemperatureUnit.valueOf(unit.getUnitFrom().toUpperCase());

            result.setResult(temperatureUnitTo.convertTo(temperatureUnitTo, temperatureUnitFrom, unit.getValue()));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unidad de temperatura inválida: " + unit.getUnitFrom());
        }
        return result;
    }
}
