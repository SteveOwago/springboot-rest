package dev.blinder.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootpracticeApplication {
	public final String authorName = "Senior Engineer Owago";
	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracticeApplication.class, args);
	}

	@GetMapping
	public String indexPage(){
		return "Welcome to Spring Boot " + authorName;
	}

}
