package com.example.teststarter;

import com.lzx.AuthorServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class TeststarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeststarterApplication.class, args);
	}

	@Autowired
	private AuthorServer authorServer;

	@RequestMapping("/author")
	String home() {
		return "发布者："+ authorServer.getAuthor();
	}
}
