package ru.ignatovichanastasiia.alfa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AlfaApplication {
    

	public static void main(String[] args) {
		SpringApplication.run(AlfaApplication.class, args);
                
                
                
	}

}
