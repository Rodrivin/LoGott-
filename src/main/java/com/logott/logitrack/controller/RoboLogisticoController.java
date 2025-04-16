package com.logott.logitrack.controller;

import com.logott.logitrack.model.RoboLogistico;
import com.logott.logitrack.service.RoboLogisticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/robots")
public class RoboLogisticoController {

    private final RoboLogisticoService roboLogisticoService;

    @Autowired
    public RoboLogisticoController(RoboLogisticoService roboLogisticoService) {
        this.roboLogisticoService = roboLogisticoService;
    }

    @GetMapping
    public ResponseEntity<List<RoboLogistico>> getAllRobos() {
        List<RoboLogistico> robos = roboLogisticoService.getAllRobos();
        return new ResponseEntity<>(robos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoboLogistico> getRoboById(@PathVariable Long id) {
        Optional<RoboLogistico> robo = roboLogisticoService.getRoboById(id);
        return robo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<RoboLogistico> createRobo(@RequestBody RoboLogistico robo) {
        RoboLogistico novoRobo = roboLogisticoService.createRobo(robo);
        return new ResponseEntity<>(novoRobo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoboLogistico> updateRobo(@PathVariable Long id, @RequestBody RoboLogistico robo) {
        RoboLogistico roboAtualizado = roboLogisticoService.updateRobo(id, robo);
        if (roboAtualizado != null) {
            return new ResponseEntity<>(roboAtualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRobo(@PathVariable Long id) {
        roboLogisticoService.deleteRobo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}