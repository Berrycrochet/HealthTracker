package org.example.healthtracker;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {

    @GetMapping("/")
    public String pocetna() {
        return "index";
    }
    @GetMapping("/napredak")
    public String napredak() {
        return "napredak"; // Grafikoni i historija
    }

    @GetMapping("/profil")
    public String profil() {
        return "profil"; // BMI kalkulator i profil
    }
}
