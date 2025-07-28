package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsCiCdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to GitHub Actions CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsCiCdApplication.class, args);
	}

}
