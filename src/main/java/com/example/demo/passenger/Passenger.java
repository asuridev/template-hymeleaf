package com.example.demo.passenger;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Passenger {
    private Integer index;
    private String name;
    private String type;
}
