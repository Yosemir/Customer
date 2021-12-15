package com.nttdata.customer.infrestructure.repository;


import com.nttdata.customer.infrestructure.model.dao.CustomerDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCrudRepository extends ReactiveCrudRepository<CustomerDao, Long> {



}
