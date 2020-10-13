package com.siigo.keyvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class KeyvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyvaultApplication.class, args);
	}

}
