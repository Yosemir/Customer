package com.nttdata.customer.model;

import com.nttdata.customer.domain.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerRepository {

    Flux<Customer> findAll();

    Mono<Customer> findById(Long id);

    Mono<Customer> save(Customer customer);

    Mono<Customer> update(Long id, Customer customer);

    Mono<Void> delete(Long id);
}
