package com.example.demo;

import java.io.IOException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:dubbo_provider.xml");
		applicationContext.start();

		System.out.println("Dubbo provider start，启动服务提供..");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
