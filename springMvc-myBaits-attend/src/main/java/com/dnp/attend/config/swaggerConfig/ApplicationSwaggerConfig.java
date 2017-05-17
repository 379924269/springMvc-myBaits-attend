package com.dnp.attend.config.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.dnp.attend.controller" })
// 必须存在 扫描的API Controller package name 也可以直接扫描class (basePackageClasses)
public class ApplicationSwaggerConfig {

	@Bean
	public Docket customDocket() {
		//
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		// Contact contact = new Contact("华仔", "", "379924269@qq.com");
		Contact contact = new Contact("", "", "");
		return new ApiInfo("适配（deviceAdaption） API文档",// 大标题 title
				"使用Swagger UI构建SpringMVC REST风格的可视化文档。  注意：“大多接口的访问都要登陆（“用户API”的登陆接口登陆），如果没有权限请联系管理员",// 小标题
				"3.0",// 版本
				"http://127.0.0.1:80/mybatis-spring/v2/api-docs",// termsOfServiceUrl
				contact,// 作者
				"",// 链接显示文字
				""// 网站链接
		);
	}

}