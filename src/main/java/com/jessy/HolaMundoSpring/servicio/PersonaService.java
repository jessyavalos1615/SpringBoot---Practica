package com.jessy.HolaMundoSpring.servicio;

import com.jessy.HolaMundoSpring.domain.Persona;
import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontraPersona(Persona persona);

}
