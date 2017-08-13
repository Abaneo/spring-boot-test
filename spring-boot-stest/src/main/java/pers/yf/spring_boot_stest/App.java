package pers.yf.spring_boot_stest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@ComponentScan()
@MapperScan("pers.yf.spring_boot_stest.mapper")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
