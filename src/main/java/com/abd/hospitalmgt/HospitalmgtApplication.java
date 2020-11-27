package com.abd.hospitalmgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abd.hospitalmgt")
@EntityScan("com.abd.hospitalmgt.entity")
public class HospitalmgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalmgtApplication.class, args);
	}

}
