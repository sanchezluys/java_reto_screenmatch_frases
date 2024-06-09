package com.aluracursos.screenmatch_frases_reto;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
               .allowedOrigins("http://localhost:5500")
               .allowedMethods(
                       "GET",
                       "POST",
                       "PUT",
                       "DELETE",
                       "OPTIONS",
                       "HEAD",
                       "TRACE",
                       "CONNECT"
                       )
               .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers")
               .allowCredentials(true)
               .maxAge(3600);
    }
}
