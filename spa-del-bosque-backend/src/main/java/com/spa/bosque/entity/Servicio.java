// entity/Servicio.java
package com.spa.bosque.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity @Data
public class Servicio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String sku;

  @Column(nullable = false)
  private String nombre;

  private String categoria;
  private String descripcion;
  private Integer duracionMin;
  private Integer precio; // CLP
  private String img;
}
