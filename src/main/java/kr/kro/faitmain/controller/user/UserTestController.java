package kr.kro.faitmain.controller.user;

import kr.kro.faitmain.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserTestController{

    @GetMapping( "/test" )
    public String getUser( Model model ){

        User user = new User( "kkaok" , "test" , "web" );
        model.addAttribute( "user" , user );
        return "test";
    }

}
