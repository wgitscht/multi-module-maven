package net.gitschthaler.server;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.gitschthaler.buildtools.IntegrationTest;
import net.gitschthaler.server.HelloWorldBean;

public class HelloWorldBeanTest extends IntegrationTest {

	@Autowired
	HelloWorldBean hello;
	
	@Test
	public void testHelloMessage() {	
		assertThat(hello.sayHello()).isEqualTo("helloWorld");
	}
}
