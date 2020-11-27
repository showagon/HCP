package com.abd.ssrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abd.ssrdemo")
@EntityScan("com.abd.ssrdemo.entity")
public class SsrdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsrdemoApplication.class, args);
	}

}
