package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex.ui.MyFrame;

@SpringBootApplication
public class WeWebApplication {

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		SpringApplication.run(WeWebApplication.class, args);
		new MyFrame();
	}

}
