package com.roadmap.proyecto2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roadmap.proyecto2.models.Unit;
import com.roadmap.proyecto2.models.UnitResultDTO;
import com.roadmap.proyecto2.services.LengthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/length")
public class LengthController {

    @Autowired
    LengthService lengthService;

    @PostMapping("/convert")
    public UnitResultDTO postMethodName(@RequestBody Unit unit) {
        return lengthService.convertLength(unit);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
