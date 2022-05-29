package kr.kro.faitmain.controller.user;

import kr.kro.faitmain.model.dto.Join;
import kr.kro.faitmain.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class UserController{

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder pwdEncoder;

    @GetMapping( "join" )
    public String join(){
        return "user/join";
    }

    @PostMapping("/join")
    public String joinProc(@Valid Join join, BindingResult bindingResult, Model model) {

        String encPwd = pwdEncoder.encode(join.getPassword());
        join.setPassword(encPwd);
        userService.join(join);

        if(bindingResult.hasErrors()) {
            List<FieldError> list = bindingResult.getFieldErrors();
            Map<String, String> errorMsg = new HashMap<>();
            for(int i=0;i<list.size();i++) {
                String field = list.get(i).getField();
                String message = list.get(i).getDefaultMessage();
                errorMsg.put(field, message);
            }
            model.addAttribute("errorMsg", errorMsg);
            return "user/join";
        }

        userService.join(join);

        return "redirect:/login";
    }


    @ResponseBody
    @GetMapping("/overlapCheck")
    public int overlapCheck(String value, String valueType) {
//		value = 중복체크할 값
//		valeuType = username, nickname
        System.out.println(value);
        System.out.println(valueType);
        int count = userService.overlapCheck(value, valueType);

        System.out.println(count);
        return count;
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
