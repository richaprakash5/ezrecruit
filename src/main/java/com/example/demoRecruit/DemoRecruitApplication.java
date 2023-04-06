package com.example.demoRecruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class  })
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"com.example.demoRecruit"})
@EntityScan("com.example.demoRecruit.entity")
@EnableJpaRepositories("com.example.demoRecruit.dao")
public class DemoRecruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRecruitApplication.class, args);
	}
	
}
