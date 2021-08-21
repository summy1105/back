package com.green.mapprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MapprjApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapprjApplication.class, args);
    }

}
