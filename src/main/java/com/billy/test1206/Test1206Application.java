package com.billy.test1206;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = { "com.billy.test1206.aspect" },exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@RestController
//@RequestMapping("/t1")
public class Test1206Application {
    @RequestMapping("/t9")
	String home(){
		return "hellouujj";
	}
	public static void main(String[] args) {
		SpringApplication.run(Test1206Application.class, args);
	}
}
