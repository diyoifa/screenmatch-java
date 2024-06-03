package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
    Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.muestraElMenu();
    }
}
