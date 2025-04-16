package com.logott.logitrack.service;

import com.logott.logitrack.model.EntregaSimulada;
import com.logott.logitrack.repository.EntregaSimuladaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EntregaSimuladaService {

    private final EntregaSimuladaRepository entregaSimuladaRepository;

    @Autowired
    public EntregaSimuladaService(EntregaSimuladaRepository entregaSimuladaRepository) {
        this.entregaSimuladaRepository = entregaSimuladaRepository;
    }

    public List<EntregaSimulada> getAllEntregas() {
        return entregaSimuladaRepository.findAll();
    }

    public Optional<EntregaSimulada> getEntregaById(Long id) {
        return entregaSimuladaRepository.findById(id);
    }

    public EntregaSimulada createEntrega(EntregaSimulada entrega) {
        return entregaSimuladaRepository.save(entrega);
    }

    public EntregaSimulada updateEntrega(Long id, EntregaSimulada entrega) {
        if (entregaSimuladaRepository.existsById(id)) {
            entrega.setId(id);
            return entregaSimuladaRepository.save(entrega);
        }
        return null; // Ou lançar uma exceção
    }

    public void deleteEntrega(Long id) {
        entregaSimuladaRepository.deleteById(id);
    }
}