package com.booleans.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    private String Index() {
        return "Index";
    }
    @GetMapping("/labs")
    private String MiniLabs() { return "MiniLabsHome"; }

    @GetMapping("/labs/Aditya")
    private String MiniLabsAditya() { return "MiniLabAdityaPage"; }

    @GetMapping("/labs/Vihan/river")
    private String River() { return "labs/Vihan/River-Recursion";}

    @GetMapping("/BooleansCalendar")
    private String BooleansCalendar() {return "Calendar";}
}