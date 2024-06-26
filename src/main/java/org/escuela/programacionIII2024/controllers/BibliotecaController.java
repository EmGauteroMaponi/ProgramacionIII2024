package org.escuela.programacionIII2024.controllers;

import org.escuela.programacionIII2024.models.Libro;
import org.escuela.programacionIII2024.models.Persona;
import org.escuela.programacionIII2024.services.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("/biblioteca")
public class BibliotecaController {

    @Autowired
    @Qualifier("service")
    private BibliotecaService bibliotecaService;

    @PostMapping("/libro")
    //Agregamos un libro nuevo a la biblioteca
    public Libro agregarLibro(@RequestBody Libro libro){
        return bibliotecaService.agregarLibro(libro);
    }

    @DeleteMapping("/libro")
    public void eliminarLibro(@RequestBody Libro libro){
        bibliotecaService.eliminarLibro(libro);
    }

    @GetMapping("/libro/{nombre}")
    public List<Libro> obtenerLibrosPorNombre(@PathVariable("nombre") String nombre){
        return bibliotecaService.buscarPorNombre(nombre);
    }
    @GetMapping("/libro/{autor}")
    public List<Libro> obtenerLibrosPorAutor(@PathVariable("autor")String autor){
        return bibliotecaService.buscarPorAutor(autor);
    }

    @PostMapping("/cliente")
    public Persona agregarCliente(@RequestBody Persona persona){
        return bibliotecaService.agregarCliente(persona);
    }

    @DeleteMapping("/cliente")
    public void eliminarCliente(@RequestBody Persona persona){
        bibliotecaService.eliminarCliente(persona);
    }

    @GetMapping("/cliente")
    public List<Persona> obtenerTodosLosClientes(){
        return bibliotecaService.getClientes();
    }

    @GetMapping("/libro")
    public List<Libro> obtenerTodosLosLibro(){
        return bibliotecaService.getLibros();
    }
}
