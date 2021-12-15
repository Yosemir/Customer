package com.nttdata.customer.infrestructure.spring.config;

import com.nttdata.customer.infrestructure.service.CustomerCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SpringConfiguration {


    @Bean
    public CustomerCrudService customerRepository(){
        return new CustomerCrudService();
    }
}
