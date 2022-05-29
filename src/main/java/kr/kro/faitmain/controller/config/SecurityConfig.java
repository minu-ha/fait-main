package kr.kro.faitmain.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@Configuration 설정파일로 등록
//@EnableWebSecurity 아래 구현하는 시큐리티 필터를 사용
//.antMatchers("/admin/**").hasRole("ADMIN")  /admin으로 시작하는 url은 권한이 ADMIN인 사람만 가능
//.antMatchers("/user/**").hasAnyRole("ADMIN, USER") /user로 시작하는 url은 권한이 ADMIN 또는 USER인 사람만 가능
//.anyRequest().permitAll() 이 외의 요청은 누구나 가능
//.loginPage("/") 권한이 없는데 권한이 필요한 페이지로 이동시 "/"페이지로 이동
//.loginProcessingUrl("/login") 실제 로그인을 처리할 주소
//.logoutSuccessUrl("/myPage") 로그아웃 성공시 이동할 페이지

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public BCryptPasswordEncoder encodePwd(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure( HttpSecurity http ) throws Exception{
        http.csrf().disable();

        http.authorizeRequests().antMatchers( "/admin/**" ).hasRole( "ADMIN" ).antMatchers( "/user/**" ).hasAnyRole( "ADMIN, USER" ).anyRequest().permitAll().and().formLogin().loginPage( "/" ) // 인증 필요한 페이지 접근시 이동페이지
                .loginProcessingUrl( "/login" ).and().logout().logoutSuccessUrl( "/myPage" );

    }
}