package com.example.demo.passenger;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("passenger")
public class PassengerController {

    private final PassengerServices passengerServices;

    public PassengerController(PassengerServices passengerServices) {
        this.passengerServices = passengerServices;
    }

    @GetMapping
    public String confirmation(){
       return passengerServices.generateTemplate();
    }
}
