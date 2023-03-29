package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Annesha Nayak
 * This is spring boot starter class.
 * It initialize spring boot and deploy the application  in Tomcat server.
 */
@SpringBootApplication
public class SalesManager {

	public static void main(String[] args) {
		SpringApplication.run(SalesManager.class, args);
	}
}
