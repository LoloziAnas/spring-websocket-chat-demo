package com.anaslolozi.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestChatApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChatApplication::main).with(TestChatApplication.class).run(args);
	}

}
