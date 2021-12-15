package com.nttdata.customer.infrestructure.service;


import com.nttdata.customer.domain.Customer;
import com.nttdata.customer.infrestructure.model.dao.CustomerDao;
import com.nttdata.customer.infrestructure.repository.CustomerCrudRepository;
import com.nttdata.customer.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;

@Component
public class CustomerCrudService implements CustomerRepository {


    @Autowired
    private CustomerCrudRepository customerCrudRepository;



    @Override
    public Flux<Customer> findAll() {
        return customerCrudRepository.findAll().map(customerDao -> getCustomer(customerDao));
    }

    @Override
    public Mono<Customer> findById(Long id) {
        return customerCrudRepository.findById(id).map(customerDao -> getCustomer(customerDao));
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        return customerCrudRepository.save(getCustomerDao(customer)).map(this::getCustomer);
    }

    @Override
    public Mono<Customer> update(Long id, Customer customer) {
        return customerCrudRepository.save(getCustomerDao(customer)).map(this::getCustomer);
    }

    @Override
    public Mono<Void> delete(Long id) {
        return customerCrudRepository.deleteById(id);
    }



    public Customer getCustomer(CustomerDao customerDao){
        Customer customer = new Customer();
        customer.setId(customerDao.getId());
        customer.setDni(customerDao.getDni());
        customer.setFirstName(customerDao.getFirstName());
        customer.setLastName(customerDao.getLastName());
        customer.setPhone(customerDao.getPhone());
        customer.setAddress(customerDao.getAddress());
        customer.setEmail(customerDao.getEmail());
        customer.setRole(customerDao.getRole());
        customer.setDate(LocalDateTime.now().toLocalDate());
        return customer;
    }


    public CustomerDao getCustomerDao(Customer customer){
        CustomerDao customerDao = new CustomerDao();
        customerDao.setId(customer.getId());
        customerDao.setDni(customer.getDni());
        customerDao.setFirstName(customer.getFirstName());
        customerDao.setLastName(customer.getLastName());
        customerDao.setPhone(customer.getPhone());
        customerDao.setAddress(customer.getAddress());
        customerDao.setEmail(customer.getEmail());
        customerDao.setRole(customer.getRole());
        customerDao.setDate(LocalDateTime.now().toLocalDate());
        return customerDao;
    }

}
