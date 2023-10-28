package com.example.demo.passenger;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passenger")
public class PassengerController {

    private final PassengerServices passengerServices;

    public PassengerController(PassengerServices passengerServices) {
        this.passengerServices = passengerServices;
    }

    @PostMapping
    public String confirmation(@RequestBody PassengerDto infoPassenger){
       return passengerServices.generateTemplate(infoPassenger);
    }
}
