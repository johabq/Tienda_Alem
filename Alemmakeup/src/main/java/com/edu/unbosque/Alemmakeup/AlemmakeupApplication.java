package com.edu.unbosque.Alemmakeup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackageClasses = CSVController.class)
public class AlemmakeupApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlemmakeupApplication.class, args);
	}

}
