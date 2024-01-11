package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Description: </p>
 * <p>Date: 2024/01/11 15:59</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
    }
}
