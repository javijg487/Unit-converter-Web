package com.roadmap.proyecto2.services;

import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;

public interface LengthService {
    UnitResultDTO convertLength(Unit unit);
}