package kr.kro.faitmain.controller.user;

import kr.kro.faitmain.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserTestController{

    @GetMapping( "/test" )
    public String getUser( Model model ){

        User user = new User( "kkaok" , "test" , "web" );
        model.addAttribute( "user" , user );
        return "thymeleaf/test";
    }

    @GetMapping( "/users" )
    public String getUserList( Model model ){
        List< User > users = new ArrayList<>();
        for ( int i = 0; i < 3; i++ ) {
            users.add( new User( "kkaok" + i , "test" + i , "web" ) );
        }
        User user = new User( "TEST ID" , "TESTER" , "web" );
        model.addAttribute( "user" , user );
        model.addAttribute( "users" , users );
        model.addAttribute( "today" , new Date() );
        model.addAttribute( "content" , "<div><span style='font-size:20px'>HLW</span></div>" );
        return "thymeleaf/users";
    }
}
