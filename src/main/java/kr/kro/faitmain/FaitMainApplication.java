package kr.kro.faitmain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan
@SpringBootApplication
public class FaitMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaitMainApplication.class, args);
	}

}
