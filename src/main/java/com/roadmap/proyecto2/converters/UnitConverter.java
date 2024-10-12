package com.roadmap.proyecto2.converters;

import org.springframework.stereotype.Component;

import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;

@Component
public class UnitConverter {

    public UnitResultDTO toUnitResultDTO(Unit unit) {
        UnitResultDTO unitResultDTO = new UnitResultDTO();

        unitResultDTO.setUnitFrom(unit.getUnitFrom());
        unitResultDTO.setUnitTo(unit.getUnitTo());
        unitResultDTO.setValueFrom(unit.getValue());
        unitResultDTO.setResult(0);
        return unitResultDTO;
    }

    public Unit toUnit(UnitResultDTO unitResultDTO) {
        Unit unit = new Unit();

        unit.setValue(unitResultDTO.getValueFrom());
        unit.setUnitFrom(unitResultDTO.getUnitFrom());
        unit.setUnitTo(unitResultDTO.getUnitTo());

        return unit;
    }

}
