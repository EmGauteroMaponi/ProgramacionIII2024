package org.escuela.programacionIII2024.services;

import org.escuela.programacionIII2024.models.Biblioteca;
import org.escuela.programacionIII2024.models.Libro;
import org.escuela.programacionIII2024.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    private Biblioteca biblioteca;

    public BibliotecaService(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }


    public Libro agregarLibro(Libro libro) {
        biblioteca.addLibro(libro);
        return libro;
    }

    public void eliminarLibro(Libro libro) {
        biblioteca.removeLibro(libro);
    }

    public List<Libro> buscarPorNombre(String nombre) {
        return biblioteca.buscarLibrosPorNombre(nombre);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return biblioteca.buscarLibrosPorAutor(autor);
    }

    public Persona agregarCliente(Persona persona) {
        biblioteca.agregarCliente(persona);
        return persona;
    }

    public void eliminarCliente(Persona persona) {
        if(biblioteca.getUsuarios().contains(persona)){

        }
        biblioteca.removeCliente(persona);
    }

    public List<Persona> getClientes() {
        return biblioteca.getUsuarios();
    }

    public List<Libro> getLibros() {
        return biblioteca.getLibros();
    }
}
