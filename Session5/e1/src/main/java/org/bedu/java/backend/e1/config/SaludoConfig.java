package org.bedu.java.backend.e1.config;

import org.bedu.java.backend.e1.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaludoConfig {
    @Bean
    public Saludo saludo(){
        return new Saludo("Alex");
    }


}
