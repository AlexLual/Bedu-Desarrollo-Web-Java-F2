package org.bedu.java.backend.E1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaludoController {


    @GetMapping("/hola")
    public ModelAndView hola(){
        ModelAndView mav = new ModelAndView("hola");
        mav.addObject("mensaje","Hola desde Thmeleaf");
        return mav;
    }

}




