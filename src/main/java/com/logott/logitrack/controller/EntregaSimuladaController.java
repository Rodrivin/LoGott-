package com.logott.logitrack.controller;

import com.logott.logitrack.model.EntregaSimulada;
import com.logott.logitrack.service.EntregaSimuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregas")
public class EntregaSimuladaController {

    private final EntregaSimuladaService entregaSimuladaService;

    @Autowired
    public EntregaSimuladaController(EntregaSimuladaService entregaSimuladaService) {
        this.entregaSimuladaService = entregaSimuladaService;
    }

    @GetMapping
    public ResponseEntity<List<EntregaSimulada>> getAllEntregas() {
        List<EntregaSimulada> entregas = entregaSimuladaService.getAllEntregas();
        return new ResponseEntity<>(entregas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntregaSimulada> getEntregaById(@PathVariable Long id) {
        Optional<EntregaSimulada> entrega = entregaSimuladaService.getEntregaById(id);
        return entrega.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<EntregaSimulada> createEntrega(@RequestBody EntregaSimulada entrega) {
        EntregaSimulada novaEntrega = entregaSimuladaService.createEntrega(entrega);
        return new ResponseEntity<>(novaEntrega, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntregaSimulada> updateEntrega(@PathVariable Long id, @RequestBody EntregaSimulada entrega) {
        EntregaSimulada entregaAtualizada = entregaSimuladaService.updateEntrega(id, entrega);
        if (entregaAtualizada != null) {
            return new ResponseEntity<>(entregaAtualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntrega(@PathVariable Long id) {
        entregaSimuladaService.deleteEntrega(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}