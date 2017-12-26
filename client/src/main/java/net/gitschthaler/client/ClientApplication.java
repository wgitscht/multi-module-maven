package net.gitschthaler.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication  {

	@Autowired
	HelloWorldClientBean hello;
	
	public static void main(String[] args) {
	 SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
        	System.out.println("Bean says: " + hello.sayHello());
        };
    }
}
