package com.logott.logitrack.service;

import com.logott.logitrack.model.RoboLogistico;
import com.logott.logitrack.repository.RoboLogisticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RoboLogisticoService {

    private final RoboLogisticoRepository roboLogisticoRepository;

    @Autowired
    public RoboLogisticoService(RoboLogisticoRepository roboLogisticoRepository) {
        this.roboLogisticoRepository = roboLogisticoRepository;
    }

    public List<RoboLogistico> getAllRobos() {
        return roboLogisticoRepository.findAll();
    }

    public Optional<RoboLogistico> getRoboById(Long id) {
        return roboLogisticoRepository.findById(id);
    }

    public RoboLogistico createRobo(RoboLogistico robo) {
        return roboLogisticoRepository.save(robo);
    }

    public RoboLogistico updateRobo(Long id, RoboLogistico robo) {
        if (roboLogisticoRepository.existsById(id)) {
            robo.setId(id);
            return roboLogisticoRepository.save(robo);
        }
        return null; // Ou lançar uma exceção
    }

    public void deleteRobo(Long id) {
        roboLogisticoRepository.deleteById(id);
    }
}