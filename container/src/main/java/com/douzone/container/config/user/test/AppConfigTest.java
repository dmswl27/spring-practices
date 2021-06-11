package com.douzone.container.config.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig;
import com.douzone.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
//		testAppConfig01();
		testAppConfig02();

	}

	//Java Config02
	// 자바 설정 클래스가 있는 베이스 패키지를 전달
	// 설정 클래스에 @Configuration이 반드시 필요하다.
	private static void testAppConfig02() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");

		User user = ac.getBean(User.class);
		System.out.println(user);

		((ConfigurableApplicationContext) ac).close();

	}

	// Java Config
	// 직접 설정 클래스를 전달
	// 설정 클래스에 @Configuration이 필요없다.
	private static void testAppConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = ac.getBean(User.class);
		System.out.println(user);

		((ConfigurableApplicationContext) ac).close();

	}

}
