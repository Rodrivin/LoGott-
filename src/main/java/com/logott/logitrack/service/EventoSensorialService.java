package com.logott.logitrack.service;

import com.logott.logitrack.model.EventoSensorial;
import com.logott.logitrack.repository.EventoSensorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventoSensorialService {

    private final EventoSensorialRepository eventoSensorialRepository;

    @Autowired
    public EventoSensorialService(EventoSensorialRepository eventoSensorialRepository) {
        this.eventoSensorialRepository = eventoSensorialRepository;
    }

    public List<EventoSensorial> getAllEventos() {
        return eventoSensorialRepository.findAll();
    }

    public Optional<EventoSensorial> getEventoById(Long id) {
        return eventoSensorialRepository.findById(id);
    }

    public EventoSensorial createEvento(EventoSensorial evento) {
        return eventoSensorialRepository.save(evento);
    }

    // Não implementaremos update e delete para eventos neste exemplo,
    // pois geralmente são apenas criados e consultados.
}