package com.ardatoa.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;


@SpringBootApplication
@EntityScan(basePackages = {"com.ardatoa"})
@ComponentScan(basePackages = {"com.ardatoa"})
@EnableJpaRepositories(basePackages = {"com.ardatoa"})
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
