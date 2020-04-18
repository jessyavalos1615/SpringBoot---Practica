package com.jessy.HolaMundoSpring.dao;

import com.jessy.HolaMundoSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
