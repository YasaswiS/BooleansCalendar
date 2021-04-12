package com.booleans.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    private String Index() {
        return "index";
    }
    @GetMapping("/labs")
    public String MiniLabs() { return "MiniLabsHome"; }

    @GetMapping("/labs/Aditya")
    public String MiniLabsAditya() { return "MiniLabAdityaPage"; }

    @GetMapping("/labs/Vihan/river")
    public String River() { return "labs/Vihan/River-Recursion";}

    @GetMapping("/BooleansCalendar")
    public String BooleansCalendar() {return "Calendar";}
}