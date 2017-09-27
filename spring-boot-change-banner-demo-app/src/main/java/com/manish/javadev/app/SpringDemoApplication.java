package com.manish.javadev.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringDemoApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}
}
