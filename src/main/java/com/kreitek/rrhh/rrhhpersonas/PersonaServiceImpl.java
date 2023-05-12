package com.kreitek.rrhh.rrhhpersonas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;
    private final PersonaMapper mapper;

    public PersonaServiceImpl(PersonaRepository personaRepository, PersonaMapper mapper) {
        this.personaRepository = personaRepository;
        this.mapper = mapper;
    }

    @Override
    public List<PersonaDTO> getAllPersons() {
        List<PersonaDTO> personas = new ArrayList<>();
       personaRepository.findAll().forEach(employee -> personas.add(this.mapper.personaToPersonaDto(employee)));
        return personas;
    }

    @Override
    public PersonaDTO createPersona(PersonaDTO personaDTO){
        Persona persona = this.mapper.personaDtoToPersona(personaDTO);

        persona = personaRepository.save(persona);
        return this.mapper.personaToPersonaDto(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Optional<PersonaDTO> getPersona(Integer id) {
        Optional<Persona> persona = personaRepository.findById(id);
        if(persona.isPresent()){
            return Optional.of(mapper.personaToPersonaDto(persona.get()));
        }else{
            return Optional.empty();
        }

    }

    @Override
    public List<PersonaDTO> getPersonByCriteria(PersonaCriteria personaCriteria) {
        List<PersonaDTO> personas = new ArrayList<>();
        personaRepository.findByNombreContains(personaCriteria.getNombre()).forEach(persona-> personas.add(this.mapper.personaToPersonaDto(persona)));
        return personas;
    }
}
