package com.leld.book.sbaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SbawsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbawsApplication.class, args);
    }

}
