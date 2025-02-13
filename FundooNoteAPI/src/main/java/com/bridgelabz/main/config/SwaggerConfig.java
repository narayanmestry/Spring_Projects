package com.bridgelabz.main.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/user.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("BridgeLabz Fellowship API")
				.description("Bridgelabz API reference for developers")
				.termsOfServiceUrl("http://javaise.com")
				.contact("mestryn9727@gmail.com").license("")
				.licenseUrl("jnuse@gmail.com").version("1.0").build();
	}

}
