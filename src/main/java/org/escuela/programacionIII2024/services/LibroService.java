package org.escuela.programacionIII2024.services;

import org.escuela.programacionIII2024.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {
    private List<Libro> libros;


    public LibroService( List<Libro> libros) {
        this.libros = libros;
    }

    public void guardarLibro(Libro libro){
        libros.add(libro);
    }

    public List<Libro> getLibros(){
        return libros;
    }

    public List<Libro> getLibroDeAutor(String autor){
        List<Libro> librosDeAutor = new ArrayList<>();
        for(Libro libro: libros){
            if (libro.getAutor().getNombre().equals(autor)){
                librosDeAutor.add(libro);
            }
        }
        return librosDeAutor;
    }

    public List<Libro> getLibrosPorGenero(String genero){
        List<Libro> librosPorGenero = new ArrayList<>();
        for(Libro libro: libros){
            if (libro.getGenero() == genero){
                librosPorGenero.add(libro);
            }
        }
        return librosPorGenero;
    }

    public List<Libro> obtenerTodos(){
        return libros;
    }
}
