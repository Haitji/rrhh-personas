package com.kreitek.rrhh.rrhhpersonas;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    List<Persona> findByNombreContains(String nombre);
}
