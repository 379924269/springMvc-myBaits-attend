package com.dnp.attend.swagger.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.collect.Sets;

@EnableWebMvc
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.dnp.attend.controller" })
// 必须存在 扫描的API Controller package name 也可以直接扫描class (basePackageClasses)
public class ApplicationSwaggerConfig {

	 @Bean
	    public Docket configSpringfoxDocketForAll() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .produces(Sets.newHashSet(MediaType.APPLICATION_JSON_UTF8_VALUE))
	                .consumes(Sets.newHashSet(MediaType.APPLICATION_JSON_UTF8_VALUE))
	                .protocols(Sets.newHashSet("http"/*, "https"*/))
	                .forCodeGeneration(true)
	                .select().paths(regex(".*"))
	                .build()
	                .apiInfo(apiInfo());
	    }

	    private ApiInfo apiInfo() {
	        @SuppressWarnings("deprecation")
			ApiInfo apiInfo = new ApiInfo(
	                "适配（deviceAdaption） API文档",
	                "使用Swagger UI构建SpringMVC REST风格的可视化文档。  注意：“大多接口的访问都要登陆（“管理员登陆API”的登陆接口登陆），如果没有权限请联系管理员”。 <br> 错误统一返回：",
	                "1.0.0",
	                "http://127.0.0.1:80/SpringMVC/v2/api-docs",
	                "",
	                "",
	                ""
	        );
	        return apiInfo;
	    }

}
