package com.localizecars.localizecars.configurations;

import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("localizecars").select()
                .apis(RequestHandlerSelectors.basePackage("com.localizecars.localizecars")).build()
                .ignoredParameterTypes(LocalDate.class, Pageable.class, CompletableFuture.class)
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class, Optional.class).tags(recursos()[0], recursos())
                .useDefaultResponseMessages(false).apiInfo(metadata());

    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("Desafio Orange Talents - Localize Cars")
                .description("Nesta API será possível realizar o cadastro de pessoas.").version("1.0.0")
                .license("Apache License Version 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0%22")
                .build();
    }

    private Tag[] recursos() {
        return new Tag[] { new Tag("Usuario", "Permite cadastrar novas pessoas."),
                new Tag("Carro", "Permite cadastro e consulta de carros.") };
    }
}
