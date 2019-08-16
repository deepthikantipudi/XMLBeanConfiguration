package com.mss.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("C:\\Users\\16605\\eclipse-workspace\\SpringBootXMLBeanConfig-1\\src\\main\\resources\\applicationContext.xml")
public class SpringBootXmlBeanConfig1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootXmlBeanConfig1Application.class, args);
	}

}
//SpringBootXMLBeanConfig-1/src/main/resources/Beans.xml