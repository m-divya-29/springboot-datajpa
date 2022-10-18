package com.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.spring.springboot.topic")
@EntityScan("com.spring.springboot.topic")
@ComponentScan({"com.spring.springboot", "com.spring.springboot.topic"})
public class SpringbootDatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaApplication.class, args);
	}

}
