package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springboot.service.TestService;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		ConfigurableApplicationContext context = new  SpringApplicationBuilder(SpringbootApplication.class)
				.profiles("test1")
				.web(WebApplicationType.NONE)//应用程序不应作为web应用程序运行，也不应启动 	*嵌入式web服务器。
				.run(args);
				
				
				 TestService testService = context.getBean(TestService.class);
				 testService.test();
	}

}
