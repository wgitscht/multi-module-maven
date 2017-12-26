package net.gitschthaler.server;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication  {

	@Autowired
	HelloWorldBean hello;
	
	public static void main(String[] args) {
	 SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
        	System.out.println("Beans loaded");
        	Arrays.asList(ctx.getBeanDefinitionNames()).forEach(x -> System.out.println(x));
        };
    }
}
