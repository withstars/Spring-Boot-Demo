package cn.withstars.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
