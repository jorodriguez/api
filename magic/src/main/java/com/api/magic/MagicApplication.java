package com.api.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value="com.api")
@EnableTransactionManagement
@SpringBootApplication
public class MagicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicApplication.class, args);
	}

}
