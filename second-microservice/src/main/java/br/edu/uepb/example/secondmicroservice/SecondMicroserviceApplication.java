package br.edu.uepb.example.secondmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SecondMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroserviceApplication.class, args);
	}

}
