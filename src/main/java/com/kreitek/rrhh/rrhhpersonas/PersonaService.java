package com.kreitek.rrhh.rrhhpersonas;

import com.kreitek.rrhh.rrhhpersonas.PersonaCriteria;
import com.kreitek.rrhh.rrhhpersonas.PersonaDTO;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<PersonaDTO> getAllPersons();

    PersonaDTO createPersona(PersonaDTO personaDTO);

    void deletePersona(Integer id);

    Optional<PersonaDTO> getPersona(Integer id);

    List<PersonaDTO> getPersonByCriteria(PersonaCriteria personaCriteria);
}
