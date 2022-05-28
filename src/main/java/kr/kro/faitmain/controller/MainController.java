package kr.kro.faitmain.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController{

    @GetMapping( "/" )
    public String test(){

        log.info( "TEST CONTROLLER" );
        return "home";
    }

    @GetMapping( "/thymeleaf" )
    public String thymeleaf(){

        log.info( "THYMELEAF TEST" );
        return "/fragments/exampleLayout";
    }


}
