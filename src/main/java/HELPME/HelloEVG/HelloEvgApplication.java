package HELPME.HelloEVG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloEvgApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEvgApplication.class, args);
		System.out.println("Hello EVG");
	}
}
