package com.example.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import com.example.client.RestTemplateConfig;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ClientApplication.class, args);
		RestTemplateConfig config = new RestTemplateConfig();
		RestTemplate restTemplate = config.restTemplate();

		String url="https://localhost:8443/api/secureHello";
		String response = restTemplate.getForObject(url, String.class);
	}
}
