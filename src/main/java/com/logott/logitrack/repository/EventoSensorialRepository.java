package com.logott.logitrack.repository;

import com.logott.logitrack.model.EventoSensorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoSensorialRepository extends JpaRepository<EventoSensorial, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}