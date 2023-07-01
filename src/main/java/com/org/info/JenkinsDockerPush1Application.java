package com.org.info;

import java.net.InetAddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerPush1Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerPush1Application.class, args);
	}
	
	@GetMapping
	public String say() throws Exception{
		return InetAddress.getLocalHost().getHostName();
	}
	

}
