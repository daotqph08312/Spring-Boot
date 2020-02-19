package com.example.Helloworld;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(App.class, args);
	
	OutFit outfit =  ((BeanFactory) context).getBean(OutFit.class);
	System.out.println("Instance :"+outfit);
	outfit.wear();
	
	Girl girl = context.getBean(Girl.class);
	System.out.println("Instance : "+girl);
	System.out.println("Girl Outfit"+girl.outfit);
	girl.outfit.wear();
	
}
}
