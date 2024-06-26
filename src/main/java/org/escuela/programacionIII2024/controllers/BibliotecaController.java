package org.escuela.programacionIII2024.controllers;

import org.escuela.programacionIII2024.models.Libro;
import org.escuela.programacionIII2024.models.Persona;
import org.escuela.programacionIII2024.services.BibliotecaService;

import java.util.List;

public class BibliotecaController {

    private BibliotecaService bibliotecaService;

    //Agregamos un libro nuevo a la biblioteca
    public Libro agregarLibro(Libro libro){
        return bibliotecaService.agregarLibro(libro);
    }

    public void eliminarLibro(Libro libro){
        bibliotecaService.eliminarLibro(libro);
    }

    public List<Libro> obtenerLibrosPorNombre(String nombre){
        return bibliotecaService.buscarPorNombre(nombre);
    }

    public List<Libro> obtenerLibrosPorAutor(String autor){
        return bibliotecaService.buscarPorAutor(autor);
    }

    public Persona agregarCliente(Persona persona){
        return bibliotecaService.agregarCliente(persona);
    }

    public void eliminarCliente(Persona persona){
        bibliotecaService.eliminarCliente(persona);
    }

    public List<Persona> obtenerTodosLosClientes(){
        return bibliotecaService.getClientes();
    }

    public List<Libro> obtenerTodosLosLibro(){
        return bibliotecaService.getLibros();
    }

    //Agregamos a un cliente a la biblioteca

    //Eliminamos a un cliente de la biblioteca
}
