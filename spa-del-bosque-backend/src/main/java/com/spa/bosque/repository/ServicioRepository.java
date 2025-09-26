package com.spa.bosque.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spa.bosque.entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
  Optional<Servicio> findBySku(String sku);
  List<Servicio> findByCategoria(String categoria);
}
