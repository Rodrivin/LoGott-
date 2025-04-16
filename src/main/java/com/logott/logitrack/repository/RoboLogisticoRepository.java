package com.logott.logitrack.repository;

import com.logott.logitrack.model.RoboLogistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoboLogisticoRepository extends JpaRepository<RoboLogistico, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}