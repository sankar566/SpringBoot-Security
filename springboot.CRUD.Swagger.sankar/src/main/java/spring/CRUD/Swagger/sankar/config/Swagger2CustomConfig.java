package spring.CRUD.Swagger.sankar.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2CustomConfig {
	
	@Bean
	public Docket AnynameSwaggerconfig() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.paths(PathSelectors.ant("/api/*"))
		.build();
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/api/*"))
//				.build()
//		        .apiInfo(new ApiInfo("Movies API","Movies management Description ", "1.0", 
//		        		"http://coder.com", new Contact ("name","url","info@coder.com"),
//		        		"open source",
//		        		"http://coder.com/license	", Collections.emptyList()));
    }


}