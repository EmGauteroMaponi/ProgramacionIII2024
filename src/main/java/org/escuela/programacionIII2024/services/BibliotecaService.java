package org.escuela.programacionIII2024.services;

import org.escuela.programacionIII2024.modelo.Libro;
import org.escuela.programacionIII2024.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {
    private final LibroService libroService;
    private final PersonaService clientesServices;
    private final PersonaService empleadosServices;


    @Autowired
    public BibliotecaService(LibroService libroService,

                             @Qualifier("empleadoServices") PersonaService empleadosServices,
                             @Qualifier("clienteServices") PersonaService clientesServices){
        this.libroService = libroService;
        this.clientesServices = clientesServices;
        this.empleadosServices = empleadosServices;
    }

    public void agregarLibro(Libro libro){
        libroService.guardarLibro(libro);
    }

    public List<Libro> getLibros(){
        return libroService.getLibros();
    }

    public List<Libro> buscarPorAutor(String autor){
        return libroService.getLibroDeAutor(autor);
    }

    public void agregarEmpleado(Persona persona){
        empleadosServices.agregarPersona(persona);
    }

    public void agregarCliente(Persona persona){
        clientesServices.agregarPersona(persona);
    }

    public List<Persona> getEmpleados(){
        return empleadosServices.obtenerTodos();
    }

    public List<Persona> getClientes(){
        return clientesServices.obtenerTodos();
    }


}
