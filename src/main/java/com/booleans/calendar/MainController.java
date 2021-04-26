package com.booleans.calendar;


import com.booleans.calendar.FRQ.Neil.Inheritance;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.Arrays;

import com.booleans.calendar.FRQ.Vihan.Sorting.Sorts;
import com.booleans.calendar.FRQ.Vihan.Computer;
import com.booleans.calendar.FRQ.Praveen.CarInheritance;
import com.booleans.calendar.FRQ.Praveen.RecursionPraveen;
import com.booleans.calendar.FRQ.Neil.RecursionNeil;
import com.booleans.calendar.FRQ.Vihan.FrogRiver;


@Controller
public class MainController extends SpringBootServletInitializer {

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

    @RequestMapping(value = "/labs/Vihan/RiverRecursion", method = {RequestMethod.GET, RequestMethod.POST})
    public String PostRiver(@RequestParam(value = "rocks", required = false, defaultValue = "3") String rocks, Model model) {

        int numrocks = Integer.parseInt(rocks);
        FrogRiver river = new FrogRiver(numrocks);

        model.addAttribute("paths", String.valueOf(river.getPaths()));
        model.addAttribute("riverTime", String.valueOf(river.getTimeElapsed()));

        return "labs/Vihan/RiverRecursion";
    }

    @RequestMapping(value = "/labs/Praveen/dafact", method = {RequestMethod.GET, RequestMethod.POST})
    public String Factorial(@RequestParam(value = "totfact", required = false, defaultValue = "3") String totfact, Model model) {

        RecursionPraveen factorial = new RecursionPraveen();
        int factnum = Integer.parseInt(totfact);

        model.addAttribute("paths", factorial.fact(factnum));
        model.addAttribute("facttime", String.valueOf(factorial.getTimeElapsed()));


        return "labs/Praveen/praveenFactorial";
    }

    @RequestMapping(value = "/labs/Neil/dafact", method = {RequestMethod.GET, RequestMethod.POST})
    public String FactorialNeil(@RequestParam(value = "totfact", required = false, defaultValue = "1") String totfact, Model model) {

        RecursionNeil factorial = new RecursionNeil();
        int factnum = Integer.parseInt(totfact);

        model.addAttribute("paths", factorial.fact(factnum));
        model.addAttribute("paths", factorial.loop(factnum));


        return "labs/Neil/NeilFactorial";
    }

    @RequestMapping(value = "/labs/Praveen/Car", method = {RequestMethod.GET, RequestMethod.POST})
    public String Car(@RequestParam(value = "Gears", required = false, defaultValue = "3") String Gears, @RequestParam(value = "Speed", required = false, defaultValue = "3") String Speed, @RequestParam(value = "Height", required = false, defaultValue = "3") String Height, Model model) {

        CarInheritance car = new CarInheritance();
        int DaGear = Integer.parseInt(Gears);
        int DaSpeed = Integer.parseInt(Speed);
        int DaHeight = Integer.parseInt(Height);

        model.addAttribute("paths", car);

        return "labs/Praveen/PraveenInheritance";
    }

    @RequestMapping(value = "/labs/Neil/inheritance", method = {RequestMethod.GET, RequestMethod.POST})
    public String Food(@RequestParam(value = "name", required = false, defaultValue = "3") String name, @RequestParam(value = "cost", required = false, defaultValue = "3") String cost, @RequestParam(value = "calories", required = false, defaultValue = "3") String calories, Model model) {

        Inheritance food = new Inheritance();
        int Daname = Integer.parseInt(name);
        int DaSpeed = Integer.parseInt(cost);
        int DaHeight = Integer.parseInt(calories);

        model.addAttribute("paths", food);

        return "labs/Neil/NeilInheritance";
    }




}