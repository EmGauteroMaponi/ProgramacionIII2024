package org.escuela.programacionIII2024.services;

import org.escuela.programacionIII2024.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private List<Persona> personas;

    public PersonaService(List<Persona> personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public Persona obtenerPersonaPorNombre(String nombre){
        for(Persona p: personas){
            if (p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }

    public List<Persona> obtenerTodos(){
        return personas;
    }
}
