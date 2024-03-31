package com.example.assesweek4.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI openApiInformation(){
        Server localServer = new Server()
                .url("http://localhost:8081")
                .description("Localhost Server URL");
        Contact contact= new Contact()
                .email("abc@gmail.com")
                .name("abc");

        Info info = new Info()
                .contact(contact)
                .description("spring boot 3 + open api 3")
                .summary("demo of spring boot 3 and open api 3 integration")
                .title("spring boot 3 + open api 3")
                .version("V1.0.0")
                .license(new License().name("apache 2.0").url("http://springdoc.org"));
        return new OpenAPI().info(info).addServersItem(localServer);
    }
}
