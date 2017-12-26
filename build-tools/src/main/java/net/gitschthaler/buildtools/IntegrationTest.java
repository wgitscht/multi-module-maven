package net.gitschthaler.buildtools;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import net.gitschthaler.client.HelloEuropeClientBean;
import net.gitschthaler.client.HelloWorldClientBean;
import net.gitschthaler.server.HelloEuropeBean;
import net.gitschthaler.server.HelloWorldBean;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {HelloWorldClientBean.class, HelloEuropeClientBean.class,
		HelloWorldBean.class,HelloEuropeBean.class})
public abstract class IntegrationTest {

}
