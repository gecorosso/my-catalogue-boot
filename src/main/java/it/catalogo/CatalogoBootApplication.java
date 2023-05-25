package it.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackages= {"it.catalogo.controller"})
@EnableJpaRepositories(basePackages = "it.catalogo.repository")
public class CatalogoBootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CatalogoBootApplication.class, args);
	}
 
	



}
