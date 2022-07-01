package com.eara.springtutorial.bdd.airport;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PremiumFlight {

    private String name;
    private boolean vip;
}
