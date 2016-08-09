package sample.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication //spring boot, auto config, and external variables (use @Value)
@EnableAutoConfiguration
@EnableEurekaClient
@EnableHystrixDashboard

public class HystrixDashboard {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HystrixDashboard.class, args);
	}

}
