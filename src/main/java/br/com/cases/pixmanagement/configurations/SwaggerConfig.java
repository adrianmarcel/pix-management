package br.com.cases.pixmanagement.configurations;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.Collections;

/**
 * Swagger 2 configuration class.
 *
 * @author Adrian
 * @version 1.0.0
 * @since 2022
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private TypeResolver typeResolver;

    /**
     * Method responsible for returning essential information to Swagger.
     *
     * @return Docket plugin documentation class.
     */
    @Bean
    public Docket pixManagementApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("api/**"))
                .paths(PathSelectors.regex("api/v1/pix-management/actuator.*").negate())
                .build()
                .pathMapping("/")
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .apiInfo(getApiInfo())
                .enableUrlTemplating(false);
    }

    /**
     * Method responsible for assembling the API information.
     *
     * @return ApiInfo class from the Swagger documentation.
     */
    private ApiInfo getApiInfo() {
        return new ApiInfo("Pix management", "Responsible to all pix management operations.",
                getClass().getPackage().getImplementationVersion(), null, null, null,
                null, Collections.emptyList());
    }
}