package com.example.demo;

import com.example.demo.circle.ComponentX;
import com.example.demo.circle.ComponentY;
import com.example.demo.circle.ComponentZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.circle")
public class DemoApplication implements CommandLineRunner {

	@Autowired
	ComponentX x;

	@Autowired
	ComponentX x2;

	@Autowired
	ComponentY y;

	@Autowired
	ComponentY y2;

	@Autowired
	ComponentZ z;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		x.show();
		y.show();
		z.show();
//		y2.show();
//		x2.show();
	}
}
