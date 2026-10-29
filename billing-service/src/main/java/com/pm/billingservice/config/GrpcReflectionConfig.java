package com.pm.billingservice.config;

import io.grpc.BindableService;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcReflectionConfig {

    // Older reflection protocol (v1alpha), used by IntelliJ's HTTP client
    @Bean
    BindableService reflectionV1Alpha() {
        return ProtoReflectionService.newInstance();
    }
}