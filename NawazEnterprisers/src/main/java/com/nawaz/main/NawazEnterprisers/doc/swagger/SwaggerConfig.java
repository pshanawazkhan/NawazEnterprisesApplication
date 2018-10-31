package com.nawaz.main.NawazEnterprisers.doc.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	
	public Docket swagerConfig() {
		
		
		return new Docket(DocumentationType.SWAGGER_2).groupName("NawazEnterprisers").apiInfo(apiInfo()).select()
				.paths(regex("/api.*")).build();
		
		
		
	}

	private ApiInfo apiInfo() {
		
		
		
		return new ApiInfoBuilder().title("Nawaz Enterprisers")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Nawaz Enterprisers Rest API")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java_Gyan_Mantra License")
				.licenseUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ").version("1.0").build();
	}
	
	
	
	
	
}
