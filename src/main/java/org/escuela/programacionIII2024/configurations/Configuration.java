package org.escuela.programacionIII2024.configurations;

import org.escuela.programacionIII2024.models.Biblioteca;
import org.escuela.programacionIII2024.models.Libro;
import org.escuela.programacionIII2024.models.Persona;
import org.escuela.programacionIII2024.services.BibliotecaService;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    public List<Libro> libros(){
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien años de soledad",new Persona("11.111.111","Gabriel Garcia Marquez"),"Novela"));
        libros.add(new Libro("Cien años de soledad", new Persona("11.111.111", "Gabriel García Márquez"), "Novela"));
        libros.add(new Libro("Don Quijote de la Mancha", new Persona("22.222.222", "Miguel de Cervantes"), "Novela clásica"));
        libros.add(new Libro("1984", new Persona("33.333.333", "George Orwell"), "Distopía"));
        libros.add(new Libro("Orgullo y prejuicio", new Persona("44.444.444", "Jane Austen"), "Romance"));
        libros.add(new Libro("El Gran Gatsby", new Persona("55.555.555", "F. Scott Fitzgerald"), "Ficción"));
        libros.add(new Libro("Matar a un ruiseñor", new Persona("66.666.666", "Harper Lee"), "Novela clásica"));
        libros.add(new Libro("Ulises", new Persona("77.777.777", "James Joyce"), "Modernismo"));
        libros.add(new Libro("En busca del tiempo perdido", new Persona("88.888.888", "Marcel Proust"), "Novela larga"));
        libros.add(new Libro("Crimen y castigo", new Persona("99.999.999", "Fyodor Dostoevsky"), "Novela psicológica"));
        libros.add(new Libro("El señor de los anillos", new Persona("10.101.010", "J.R.R. Tolkien"), "Fantasía épica"));
        libros.add(new Libro("Los miserables", new Persona("11.111.112", "Victor Hugo"), "Novela histórica"));
        libros.add(new Libro("Crónica de una muerte anunciada", new Persona("11.111.113", "Gabriel García Márquez"), "Realismo mágico"));
        libros.add(new Libro("El retrato de Dorian Gray", new Persona("11.111.114", "Oscar Wilde"), "Ficción gótica"));
        libros.add(new Libro("La sombra del viento", new Persona("11.111.115", "Carlos Ruiz Zafón"), "Misterio"));
        libros.add(new Libro("Los pilares de la Tierra", new Persona("11.111.116", "Ken Follett"), "Novela histórica"));
        libros.add(new Libro("El nombre de la rosa", new Persona("11.111.117", "Umberto Eco"), "Novela histórica"));
        libros.add(new Libro("La Odisea", new Persona("11.111.118", "Homero"), "Épica"));
        libros.add(new Libro("La metamorfosis", new Persona("11.111.119", "Franz Kafka"), "Ficción"));
        libros.add(new Libro("El principito", new Persona("11.111.120", "Antoine de Saint-Exupéry"), "Literatura infantil"));
        libros.add(new Libro("Moby-Dick", new Persona("11.111.121", "Herman Melville"), "Aventura"));
        return libros;
    }
    public List<Persona> clientes(){
        List<Persona> clientes = new ArrayList<>();
        clientes.add(new Persona("12357741", "Carlos Gutierrez"));
        clientes.add(new Persona("23451234", "María Rodríguez"));
        clientes.add(new Persona("34562345", "Luis Pérez"));
        clientes.add(new Persona("45673456", "Ana Martínez"));
        clientes.add(new Persona("56784567", "Juan López"));
        clientes.add(new Persona("67895678", "Laura Fernández"));
        clientes.add(new Persona("78906789", "Diego González"));
        clientes.add(new Persona("89017890", "Sofía Ramírez"));
        clientes.add(new Persona("90128901", "Andrés Silva"));
        clientes.add(new Persona("01239012", "Valentina Herrera"));
        clientes.add(new Persona("12341234", "Elena Pérez"));
        clientes.add(new Persona("23452345", "Ricardo Fernández"));
        clientes.add(new Persona("34563456", "Isabel Rodríguez"));
        clientes.add(new Persona("45674567", "Pedro Gómez"));
        clientes.add(new Persona("56785678", "Carolina López"));
        clientes.add(new Persona("67896789", "Federico Martínez"));
        clientes.add(new Persona("78907890", "Valentín Silva"));
        clientes.add(new Persona("89018901", "Lucía Ramírez"));
        clientes.add(new Persona("90129012", "Hugo González"));
        clientes.add(new Persona("01230123", "Marcela Herrera"));
        return clientes;
    }

    public Biblioteca biblioteca(List<Libro> libros, List<Persona> personas){
        return new Biblioteca(libros,personas);
    }

    public BibliotecaService bibliotecaService(Biblioteca biblioteca){
        return new BibliotecaService(biblioteca);
    }
}
