package net.gitschthaler.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.gitschthaler.buildtools.IntegrationTest;

public class HelloEuropeBeanTest extends IntegrationTest {

	@Autowired
	HelloWorldClientBean hello;
	
	@Test
	public void testHelloMessage() {	
		assertThat(hello.sayHello()).isEqualTo("helloWorld");
	}
}
