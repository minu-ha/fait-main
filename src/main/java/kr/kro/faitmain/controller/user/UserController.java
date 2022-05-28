package kr.kro.faitmain.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController{

    @GetMapping( "join" )
    public String join(){
        return "user/join";
    }

    @GetMapping( "/myPage" )
    public String myPage(){
        return "user/myPage";
    }

    @GetMapping( "/login" )
    public String login(){
        return "user/login";
    }

}
