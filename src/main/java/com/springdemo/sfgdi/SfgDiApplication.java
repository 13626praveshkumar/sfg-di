package com.springdemo.sfgdi;

import com.springdemo.sfgdi.controller.ConstructorInjectedController;
import com.springdemo.sfgdi.controller.MyController;
import com.springdemo.sfgdi.controller.PropertyInjectController;
import com.springdemo.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
//		String hello = myController.getHello();
//		System.out.println(hello);
		System.out.println("---Primary Bean Demo---");
		System.out.println(myController.sayHello());

		System.out.println("---property injected bean demo---");
		PropertyInjectController propertyInjectController=(PropertyInjectController) ctx.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());

		System.out.println("---Setter injected bean demo---");
		SetterInjectedController setterInjectedController=(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayGreeting());

		System.out.println("---Constructor injected bean demo---");
		ConstructorInjectedController controller=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(controller.sayHello());
	}
}
