package com.manish.javadev.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FirstSpringBootDemoAppApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}
}
