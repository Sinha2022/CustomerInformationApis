/*
 * Customer Information Application
 * A set of RESTful API's that allow user to obtain all customer information, create a customer, update a customer, delete a customer
 *
 * OpenAPI spec version: 1.0.0
 * Contact: sukantasinha2003@gmail.com
 */


package io.swagger.client;

import io.swagger.client.swaggerconfig.SwaggerJacksonModuleRegistrar;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableCaching
@EnableScheduling
@EnableAsync
@EnableEncryptableProperties
public class Application extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Bean
    public SwaggerJacksonModuleRegistrar swaggerJacksonModuleRegistrar() {
        return new SwaggerJacksonModuleRegistrar();
    }
}