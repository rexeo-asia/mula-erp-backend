package com.mulaerp.config;

import com.mulaerp.repository.BOMRepository;
import com.mulaerp.repository.BOMRepositoryImpl;
import com.mulaerp.repository.WorkOrderRepository;
import com.mulaerp.repository.WorkOrderRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public BOMRepository bomRepository() {
        return new BOMRepositoryImpl();
    }

    @Bean
    public WorkOrderRepository workOrderRepository() {
        return new WorkOrderRepositoryImpl();
    }
}
