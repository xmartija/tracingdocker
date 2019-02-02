package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

@SpringBootApplication
@RestController
public class DemoApplication {

  private static Logger log = LoggerFactory.getLogger(DemoApplication.class);

  @Autowired
  RestTemplate restTemplate;

  @Bean
  public RestTemplate getRestTemplate() {
      return new RestTemplate();
  }

  @RequestMapping("/")
  public String home() {
    log.info("Delegating");
    String response = (String) restTemplate.exchange("http://demoservice:8080/",
                 HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
    return "delegated greeting : " + response;
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
