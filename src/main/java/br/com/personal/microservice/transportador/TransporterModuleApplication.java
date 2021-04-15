package br.com.personal.microservice.transportador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransporterModuleApplication {

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled", "true");
		SpringApplication.run(TransporterModuleApplication.class, args);
	}

}
