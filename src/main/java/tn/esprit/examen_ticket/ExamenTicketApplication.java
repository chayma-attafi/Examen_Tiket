package tn.esprit.examen_ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ExamenTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenTicketApplication.class, args);
    }

}
