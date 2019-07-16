package com.metamagic.ms;
 
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;
/**
 * @author sagar
 * THIS CONFIG CLASS USED FOR FOLLWING THINGS
 * 1.EUREKA
 * 2.CIRCUITBREAKER
 * 3.LOAD BALANCER
 * 4.THREAD POOL
 */
@Configuration
@EnableDiscoveryClient
public class Config {
 

}
