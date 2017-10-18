package com.example.hellofabric8demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Hellofabric8demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hellofabric8demoApplication.class, args);
	}
}


@RestController
@RequestMapping("/api")
class HelloController{
	private static int counter = 0;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public Map<String, Object> hello(@PathVariable String name) throws Exception{
		HashMap response = new HashMap();
		response.put("response","hello");
		response.put("your name", name);
		response.put("count: ", counter++);

		return response;
	}
}