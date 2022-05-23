package kr.kro.faitmain.controller.test;

import kr.kro.faitmain.domain.test.TestVo;
import kr.kro.faitmain.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class TestController{

    @Autowired
    TestService testService;

    @RequestMapping( "/home" )
    public String home(){

        log.info( "home controller" );
        return "index.html";
    }

//    @ResponseBody
//    @RequestMapping( "/valueTest" )
//    public String valueTest(){
//        String value = "TEST STRING";
//        return value;
//    }

//    @RequestMapping( "/test" )
//    public ModelAndView test() throws Exception{
//
//        ModelAndView mav = new ModelAndView( "test" );
//        List< TestVo > testList = testService.selectTest();
//        mav.addObject( "list" , testList );
//
//        return mav;
//    }

}