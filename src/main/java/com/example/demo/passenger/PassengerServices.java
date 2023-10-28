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

    public String generateTemplate(PassengerDto infoPassenger){
        final Context ctx = new Context();
        ctx.setVariable("passengers", infoPassenger.getInfo());
        return this.templateEngine.process("email", ctx);
    }

}
