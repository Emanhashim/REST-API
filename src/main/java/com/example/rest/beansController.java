package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class beansController {

    @GetMapping("/restbean")
    public Beans getbean(){
        return new Beans("eman", "hahsim");
    }

    @GetMapping("/restbean2")
    public List<Beans> getbean2(){
        List <Beans> beanslist = new ArrayList<>();
        beanslist.add(new Beans("sara","hashim"));
        beanslist.add(new Beans("saraeman","hashim"));
        beanslist.add(new Beans("saradad","hashim"));
        return beanslist;
    }

//    @PathVariable
    @GetMapping( "/eman/{firstname}/{lastname}")

    public Beans beanspath(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname){

        return  new Beans(firstname, lastname);
    }

//    this request parameters
    @GetMapping("/beansrequest")
    public  Beans beansrequest(@RequestParam(name = "firstname") String firstname,
                               @RequestParam(name = "lastname") String lastname){
                        return  new Beans(firstname, lastname);



    }


}
