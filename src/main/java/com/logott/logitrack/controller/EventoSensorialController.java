package com.logott.logitrack.controller;

import com.logott.logitrack.model.EventoSensorial;
import com.logott.logitrack.service.EventoSensorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
public class EventoSensorialController {

    private final EventoSensorialService eventoSensorialService;

    @Autowired
    public EventoSensorialController(EventoSensorialService eventoSensorialService) {
        this.eventoSensorialService = eventoSensorialService;
    }

    @GetMapping
    public ResponseEntity<List<EventoSensorial>> getAllEventos() {
        List<EventoSensorial> eventos = eventoSensorialService.getAllEventos();
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoSensorial> getEventoById(@PathVariable Long id) {
        Optional<EventoSensorial> evento = eventoSensorialService.getEventoById(id);
        return evento.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<EventoSensorial> createEvento(@RequestBody EventoSensorial evento) {
        EventoSensorial novoEvento = eventoSensorialService.createEvento(evento);
        return new ResponseEntity<>(novoEvento, HttpStatus.CREATED);
    }

    // Não implementamos endpoints para PUT e DELETE de eventos neste exemplo,
    // pois geralmente são apenas criados e consultados.
}