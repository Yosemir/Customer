package com.nttdata.customer.operations;


import com.nttdata.customer.domain.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerOperations {

    Flux<Customer> findAll() throws Exception;

    Mono<Customer> findById(Long id) throws Exception;

    Mono<Customer> save(Customer customer) throws Exception;

    Mono<Customer> update(Long id, Customer customer) throws Exception;

    Mono<Void> delete(Long id) throws Exception;
}
