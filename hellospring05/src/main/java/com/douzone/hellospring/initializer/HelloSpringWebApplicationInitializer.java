package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HelloSpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

//	<init-param>
//		<param-name>contextClass</param-name>
//		<param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
//	</init-param>
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Root Application Context 설정 파일
		return null;
	}
	
//	<init-param>
//		<param-name>contextConfigLocation</param-name>
//		<param-value>com.douzone.hellospring.config.WebConfig</param-value>
//	</init-param>

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Web Application Context 설정 클래스 
		return new Class<?>[] {WebConfig.class};
	}

//	<servlet-mapping>
//		<servlet-name>spring</servlet-name>
//		<url-pattern>/</url-pattern>
//	</servlet-mapping>
	
	@Override
	protected String[] getServletMappings() {
		// DispatcherServlet Mapping URL
		return new String[] {"/"};
	}

}
