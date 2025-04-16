package com.logott.logitrack.repository;

import com.logott.logitrack.model.EntregaSimulada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaSimuladaRepository extends JpaRepository<EntregaSimulada, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}