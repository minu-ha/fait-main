package kr.kro.faitmain.controller.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestRestController{

    @RequestMapping( "/testValue" )
    public String getTestVAlue(){
        String TestValue = "RESTCONTROLLER TEST";
        return TestValue;
    }
}