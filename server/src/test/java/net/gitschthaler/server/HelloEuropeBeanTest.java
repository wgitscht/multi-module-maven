package net.gitschthaler.server;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.gitschthaler.buildtools.IntegrationTest;
import net.gitschthaler.server.HelloWorldBean;


public class HelloEuropeBeanTest extends IntegrationTest {

	@Autowired
	HelloWorldBean hello;
	
	@Test
	public void testHelloMessage() {	
		assertThat(hello.sayHello()).isEqualTo("helloWorld");
	}
}
