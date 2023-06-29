package com.eper2.eper2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestEper2Application {

	public static void main(String[] args) {
		SpringApplication.from(Eper2Application::main).with(TestEper2Application.class).run(args);
	}

}
