package com.anaslolozi.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(()-> System.out.println("main method"));
		SpringApplication.run(ChatApplication.class, args);
	}

}
