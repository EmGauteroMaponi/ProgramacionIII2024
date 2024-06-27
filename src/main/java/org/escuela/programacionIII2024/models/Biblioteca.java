package org.escuela.programacionIII2024.models;

import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;
    private List<Persona> personas;

    public Biblioteca(List<Libro> libros, List<Persona> personas) {
        this.personas = personas;
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Persona> getUsuarios() {
        return personas;
    }

    public void setUsuarios(List<Persona> personas) {
        this.personas = personas;
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public void removeLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> buscarLibrosPorNombre(String nombre) {
        return libros.stream().filter( libro -> libro.getNombre().equals(nombre)).collect(Collectors.toList());
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        return libros.stream().filter(libro -> libro.getAutor().getNombre().equals(autor)).collect(Collectors.toList());
    }

    public void agregarCliente(Persona persona) {
        personas.add(persona);
    }

    public void removeCliente(Persona persona) {
        personas.remove(persona);
    }
}
