package com.example.sms2;

import org.springframework.context.annotation.Bean;
import org.springdoc.core.models.GroupedOpenApi;

public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .pathsToMatch("com.example.sms2.*")
                .build();
    }
}
