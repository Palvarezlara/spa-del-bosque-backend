package com.spa.bosque.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.bosque.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
  List<Reserva> findByUserEmail(String email);
  boolean existsByTerapeutaIdAndFechaAndHora(String terapeutaId, LocalDate f, LocalTime h);
}
