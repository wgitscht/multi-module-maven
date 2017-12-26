package net.gitschthaler.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.gitschthaler.client.HelloWorldClientBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloEuropeBeanTest {

	@Autowired
	HelloWorldClientBean hello;
	
	@Test
	public void testHelloMessage() {	
		assertThat(hello.sayHello()).isEqualTo("helloWorld");
	}
}
