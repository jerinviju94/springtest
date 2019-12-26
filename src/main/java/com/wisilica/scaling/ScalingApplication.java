package com.wisilica.scaling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class ScalingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalingApplication.class, args);
	}

}
