package org.escuela.programacionIII2024.controller;

import org.escuela.programacionIII2024.modelo.Libro;
import org.escuela.programacionIII2024.modelo.Persona;
import org.escuela.programacionIII2024.services.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    @Autowired
    public BibliotecaController(@Qualifier("bibliotecaService") BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }


    @PostMapping("/empleado")
    public Persona agregarEmpleado(@RequestBody Persona empleado){
        bibliotecaService.agregarEmpleado(empleado);
        return empleado;
    }


    @PostMapping("/cliente")
    public Persona agregarCliente(@RequestBody Persona cliente){
        bibliotecaService.agregarCliente(cliente);
        return cliente;
    }

    @GetMapping("/cliente")
    public List<Persona> obtenerClientes(){
        return bibliotecaService.getClientes();
    }

    @GetMapping("/empleado")
    public List<Persona> obtenerEmpleados(){
        return bibliotecaService.getEmpleados();
    }

    @PostMapping("/libro")
    public Libro agregarLibro (@RequestBody Libro libro){
        bibliotecaService.agregarLibro(libro);
        return libro;
    }

    @GetMapping("/libro")
    public List<Libro> obtenerLibros (){
        return bibliotecaService.getLibros();
    }

    @GetMapping("/libro/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable(value = "autor") String autor){
        return bibliotecaService.buscarPorAutor(autor);
    }

}
