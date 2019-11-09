package com.softtron.pinmaologin.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class Login extends WebMvcConfigurationSupport{
	public HandlerInterceptor getHandlerInterceptor() {
		return new HandlerInterceptor() {
			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
				System.out.println(request.getServletPath()+"Path");
				System.out.println("拦截");
				return true;
			}
		};
	}
	
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		super.addInterceptors(registry);
		registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
	}
}
