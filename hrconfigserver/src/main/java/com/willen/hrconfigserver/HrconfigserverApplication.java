package com.willen.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrconfigserverApplication implements CommandLineRunner {
	// CommandLineRunner - executa comandos durante inicialização do projeto

	@Value("${spring.cloud.config.server.git.username}")
	private String username;

	public static void main(String[] args) {
		SpringApplication.run(HrconfigserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("USERNAME = " + username);
	}
}
