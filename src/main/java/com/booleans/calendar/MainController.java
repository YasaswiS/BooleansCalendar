package com.booleans.calendar;

import com.booleans.calendar.FRQ.Praveen.CarInheritance;
import com.booleans.calendar.FRQ.Praveen.RecursionPraveen;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.booleans.calendar.FRQ.Neil.RecursionNeil;
import com.booleans.calendar.FRQ.Vihan.FrogRiver;
import java.util.ArrayList;
import java.util.Arrays;
import com.booleans.calendar.FRQ.Vihan.Sorting.Sorts;

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

        return "labs/Praveen/praveenFactorial";
    }

    @GetMapping("labs/Vihan/Sorts")
    public String VihanSort() {return "/labs/Vihan/Sorts.html";
    }

    /*@RequestMapping(value = "/labs/Vihan/sort", method = {RequestMethod.GET, RequestMethod.POST})
    public String VihanSort(@RequestParam(value = "array", required = false, defaultValue = "default") String array, @RequestParam(value="arrayType", required = false, defaultValue="Integer") String arrayType, Model model) {
        switch (arrayType) {
            case "String":

                break;
            case "Integer":
                Integer[] test = new Integer[] {1,3,5,1,367,327,812,33312,82394};

                Sorts sort = new Sorts(new ArrayList<Comparable>(Arrays.asList(test)));
                model.addAttribute("insertionTime", sort.insertionTime);
                model.addAttribute("selectionTime", sort.selectionTime);
                model.addAttribute("bubbleTime", sort.bubbleTime);
                model.addAttribute("arraysMatch", sort.arraysMatch);
                break;
            case "POJO":
                break;
        }

    return "/labs/Vihan/Sorts";
    }*/

}