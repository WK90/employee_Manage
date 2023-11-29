package com.crazy.employee.manage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author zhxm
 * @version 1.0.0
 * @ClassName SwaggerConfig
 * @Description
 * @date 2023-11-29
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.crazy.employee.manage.controller"))
                .paths(PathSelectors.any())
                .build();
//                .globalOperationParameters(setHeaderToken());

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("职员信息管理系统")
                .description("职员信息管理系统")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }


    /**
     * 设置swagger文档中全局参数
     * @return
     */
//    private List<Parameter> setHeaderToken() {
//        List<Parameter> pars = new ArrayList<>();
//        ParameterBuilder userId = new ParameterBuilder();
//        userId.name("token").description("用户TOKEN").modelRef(new ModelRef("string")).parameterType("header")
//                .required(true).build();
//        pars.add(userId.build());
//        return pars;
//    }
}

