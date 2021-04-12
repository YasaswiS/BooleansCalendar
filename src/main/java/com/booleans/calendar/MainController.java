package com.booleans.calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import FRQ.Vihan.FrogRiver;

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

    @GetMapping("/BooleansCalendar")
    public String BooleansCalendar() {return "Calendar";}

    @GetMapping("/calculator")
    public String Calculator() {return "labs/Aditya/Calculator";}

    /*@GetMapping("/labs/Vihan/river")
    public String river() {return "/labs/Vihan/River-Recursion";}
*/
    @RequestMapping(value = "/labs/Vihan/river", method = {RequestMethod.GET, RequestMethod.POST})
    public String PostRiver(@RequestParam(value = "rocks", required = false, defaultValue = "3") String rocks, Model model) {

        int numrocks = Integer.parseInt(rocks);
        FrogRiver river = new FrogRiver(numrocks);

        model.addAttribute("paths", String.valueOf(river.getPaths()));
        model.addAttribute("riverTime", String.valueOf(river.getTimeElapsed()));

        return "labs/Vihan/River-Recursion";
    }


}