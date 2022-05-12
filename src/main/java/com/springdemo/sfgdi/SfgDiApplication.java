package com.springdemo.sfgdi;

import com.springdemo.sfgdi.controller.*;
import com.springdemo.sfgdi.datasource.FakeDataSource;
import com.springdemo.sfgdi.services.PrototypeBean;
import com.springdemo.sfgdi.services.SingletonBean;
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


		System.out.println("---Profiles  demo---");
		I18nConttroller i18nConttroller=(I18nConttroller) ctx.getBean("i18nConttroller");
		System.out.println(i18nConttroller.sayHello());


		System.out.println("---Singleton  demo constructor called before startup---");
		SingletonBean singletonBean1=(SingletonBean) ctx.getBean(SingletonBean.class);
		SingletonBean singletonBean2=(SingletonBean) ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		System.out.println(singletonBean2.getMyScope());



		System.out.println("---Prototype  demo---");
		PrototypeBean prototypeBean1=(PrototypeBean) ctx.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2=(PrototypeBean) ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("---Datasource properties  demo---");
		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());



	}
}
