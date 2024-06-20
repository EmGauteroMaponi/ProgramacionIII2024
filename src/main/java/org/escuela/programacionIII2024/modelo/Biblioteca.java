package org.escuela.programacionIII2024.modelo;

import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Persona> personas;

    public Biblioteca() {
    }

    public Biblioteca(List<Libro> libros, List<Persona> personas) {
        this.libros = libros;
        this.personas = personas;
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
}
