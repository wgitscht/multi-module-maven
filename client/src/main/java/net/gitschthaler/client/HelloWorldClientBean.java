package net.gitschthaler.client;


import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldClientBean {
	public String sayHello() {
		return "helloWorld";
	}
	
	@PostConstruct
	public void postConstruct() {
		try {
			System.out.println("waiting for " + this.getClass().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
