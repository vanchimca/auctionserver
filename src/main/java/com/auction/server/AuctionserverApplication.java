package com.auction.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuctionserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionserverApplication.class, args);
	}

}
