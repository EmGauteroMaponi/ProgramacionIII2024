package org.escuela.programacionIII2024.configuraciones;

import org.escuela.programacionIII2024.services.LibroService;
import org.escuela.programacionIII2024.services.PersonaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Configurations {

    @Bean
    public PersonaService empleadoServices(){
        return new PersonaService(new ArrayList<>());
    }

    @Bean
    public PersonaService clienteServices(){
        return new PersonaService(new ArrayList<>());
    }

    @Bean
    public LibroService libroServices(){
        return new LibroService(new ArrayList<>());
    }
}
