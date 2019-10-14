package com.payment.method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author muhammad.suleman 11th/10/2019
 * @version 1.0
 * @since v1.0
 * In this program, we've shown how to make use of the Stripe Java API to charge a credit card.
 */
@EnableSwagger2
@EnableEurekaClient
@SpringBootApplication

public class MethodApplication
{//start of class

    public static void main(String[] args)
    {//start of main
        SpringApplication.run(MethodApplication.class, args);
    }//end of main

}//end of class
