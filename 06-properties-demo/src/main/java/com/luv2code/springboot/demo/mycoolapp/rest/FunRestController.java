package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

    public class FunRestController {
//inject properties for: soldier.name and chasseur.name

    @Value("${soldier.name}")
    private String soldierName;

    @Value("${chasseur.name}")
    private String chasseurName;

    //expose new endpoint for "unity info"

    @GetMapping( "/unityinfo" )
    // expose "/" that return "Hello World"

    public String getUnityInfo(){

        return "Soldier: " + soldierName + "<--------->" +
                "Chasseur: " + chasseurName;

    }




    @GetMapping("/")

    public String sayHello(){

        return "Hello World";

    }

    //expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a hard 5k!";

    }

    //expose a new endpoint for "fortune"


    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day";

    }




}
