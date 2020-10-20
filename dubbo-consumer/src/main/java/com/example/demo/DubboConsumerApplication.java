package com.example.demo;

import com.example.demo.service.DemoService;
import java.io.IOException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboConsumerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:dubbo_consumer.xml");
		applicationContext.start();

		DemoService demoService =
				(DemoService) applicationContext.getBean("ddemoService");

		System.out.println(demoService.getPermissions(24152365L));

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
