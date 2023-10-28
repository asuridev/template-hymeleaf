package com.example.demo.passenger;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Arrays;
import java.util.List;

@Service
public class PassengerServices {

    private final TemplateEngine templateEngine;

    public PassengerServices(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String generateTemplate(){
        Passenger pass1 = Passenger.builder().name("ANA MEZA").type("Adulto").index(1)
                .build();

        Passenger pass2 = Passenger.builder().name("MARIA RODRIGUEZ").type("Adulto").index(2)
                .build();

        Passenger pass3 = Passenger.builder().name("CAMILO DAZA").type("Niño").index(1)
                .build();
        Passenger pass4 = Passenger.builder().name("LADY OSPINO").type("Niño").index(2)
                .build();
        Passenger pass5 = Passenger.builder().name("ADA SUAREZ").type("Infante").index(1)
                .build();
        List<Passenger> passengers = Arrays.asList(pass1,pass2,pass3,pass4,pass5);

        final Context ctx = new org.thymeleaf.context.Context();
        ctx.setVariable("passengers", passengers);
        return this.templateEngine.process("email", ctx);
    }

}
