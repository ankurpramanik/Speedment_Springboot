package com.ada.speedment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerOpenAPIConfig {

	@Bean
	public OpenAPI customOpenAPI() {

		return new OpenAPI().info(new Info().title("Sample Application API").version("v1").title("Title")
				.description("This is description"));
	}

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("jcboe-jobbucket-api").select()
//				.apis(RequestHandlerSelectors.basePackage("com.jcboe.jobbucket.controller")).paths(PathSelectors.any())
//				.build()
//				.apiInfo(new ApiInfoBuilder().title("Job Bucket API").description("Job Bucket API").build());
//	}

}
