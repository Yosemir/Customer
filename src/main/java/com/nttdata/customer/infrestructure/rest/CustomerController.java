package com.nttdata.customer.infrestructure.rest;


import com.nttdata.customer.domain.Customer;
import com.nttdata.customer.operations.CustomerOperations;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {


    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private final CustomerOperations customerOperations;


    @GetMapping("list")
    public Flux<Customer> getall() throws Exception{
        try {
            return customerOperations.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Mono<Customer> getOne(@PathVariable Long id) throws Exception {
        try {
            return customerOperations.findById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @PostMapping("add")
    public Mono<Customer> save(@RequestBody Customer customer) throws Exception {
        try {
            return customerOperations.save(customer);
        }catch (Exception e){
            throw e;
        }
    }

    @PutMapping("/{id}")
    public Mono<Customer> update(@PathVariable Long id, @RequestBody Customer customer) throws Exception {
        try {
            return customerOperations.update(id , customer);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) throws Exception {
        try {
            return customerOperations.delete(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
