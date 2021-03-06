package com.fabrikam.dronedelivery.ingestion;

import com.fabrikam.dronedelivery.ingestion.configuration.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
@EnableSwagger2
public class IngestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngestionApplication.class, args);
	}

}
