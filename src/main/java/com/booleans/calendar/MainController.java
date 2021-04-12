package com.booleans.calendar;

import com.booleans.calendar.FRQ.Praveen.RecursionPraveen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.booleans.calendar.FRQ.Neil.RecursionNeil;
import com.booleans.calendar.FRQ.Vihan.FrogRiver;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String Index() {
        return "Index";
    }
    @GetMapping("/labs")
    public String MiniLabs() { return "MiniLabsHome"; }

    @GetMapping("/BooleansCalendar")
    public String BooleansCalendar() {return "Calendar";}

    @GetMapping("/calculator")
    public String Calculator() {return "LabsHTMLPages/Aditya/AdityaRecursionCalculator";}

    /*@GetMapping("/labs/Vihan/river")
    public String river() {return "/LabsHTMLPages/Vihan/RiverRecursion";}*/

    @RequestMapping(value = "/labs/Vihan/river", method = {RequestMethod.GET, RequestMethod.POST})
    public String PostRiver(@RequestParam(value = "rocks", required = false, defaultValue = "3") String rocks, Model model) {

        int numrocks = Integer.parseInt(rocks);
        FrogRiver river = new FrogRiver(numrocks);

        model.addAttribute("paths", String.valueOf(river.getPaths()));
        model.addAttribute("riverTime", String.valueOf(river.getTimeElapsed()));

        return "LabsHTMLPages/Vihan/RiverRecursion";
    }

    @RequestMapping(value = "/labs/Praveen/dafact", method = {RequestMethod.GET, RequestMethod.POST})
    public String Factorial(@RequestParam(value = "totfact", required = false, defaultValue = "3") String totfact, Model model) {

        RecursionPraveen factorial = new RecursionPraveen();
        int factnum = Integer.parseInt(totfact);

        model.addAttribute("paths", factorial.fact(factnum));


        return "LabsHTMLPages/Praveen/PraveenFactorial";
    }

    @RequestMapping(value = "/labs/Neil/FactorialRecursion", method = {RequestMethod.GET, RequestMethod.POST})
    public String FactorialNeil(@RequestParam(value = "totfact", required = false, defaultValue = "1") String totfact, Model model) {

        RecursionNeil factorial = new RecursionNeil();
        int factnum = Integer.parseInt(totfact);

        model.addAttribute("paths", factorial.fact(factnum));
        model.addAttribute("paths", factorial.loop(factnum));


        return "LabsHTMLPages/Neil/NeilFactorial";
    }


}