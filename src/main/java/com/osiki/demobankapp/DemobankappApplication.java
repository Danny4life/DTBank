package com.osiki.demobankapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Demo Bank App",
				description = "A demo bank application",
				version = "v1.0",
				contact = @Contact(
						name = "Segun Osiki",
						email = "osiki.segun@gmail.com",
						url = ""
				),
				license = @License(
						name = "Demo Bank App",
						url = ""
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "A demo bank app documentation",
				url = ""
		)
)
public class DemobankappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobankappApplication.class, args);
	}

}
