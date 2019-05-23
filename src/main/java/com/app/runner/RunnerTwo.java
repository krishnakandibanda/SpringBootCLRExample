package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class RunnerTwo implements CommandLineRunner,Ordered {

	@Override
	public int getOrder() {
		return 10;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is My RunnerTwo --- TWO ---");
		
	}
}
