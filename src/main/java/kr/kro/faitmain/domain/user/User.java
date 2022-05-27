package kr.kro.faitmain.domain.user;

import lombok.Data;

@Data
public class User{

    private String userId;
    private String userPwd;
    private String name;
    private String authType;

    public User( String userId , String name , String authType ){
    }
}
