package com.example.client.service;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final RestTemplate restTemplate;

    @Autowired
    public ClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getServerResponse() {
        String url = "https://localhost:8443/api/greet";
        return restTemplate.getForObject(url, String.class);
    }
}