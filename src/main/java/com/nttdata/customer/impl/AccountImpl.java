package com.nttdata.customer.impl;

import com.nttdata.customer.domain.Customer;
import com.nttdata.customer.model.CustomerRepository;
import com.nttdata.customer.operations.CustomerOperations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountImpl implements CustomerOperations {



    private final CustomerRepository customerRepository;

    @Override
    public Flux<Customer> findAll() throws Exception {
        try {
            return customerRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Customer> findById(Long id) throws Exception {
        try {
            return customerRepository.findById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Customer> save(Customer customer) throws Exception {
        try {
            return customerRepository.save(customer);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Customer> update(Long id, Customer customer) throws Exception {
        try {
            return customerRepository.update(id, customer);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Void> delete(Long id) throws Exception {
        return customerRepository.delete(id);
    }
}
