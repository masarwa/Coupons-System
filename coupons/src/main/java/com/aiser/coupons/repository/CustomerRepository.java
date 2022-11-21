package com.aiser.coupons.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiser.coupons.bean.Customer;
import java.util.*;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByName(String name);

    Customer findById(long id);

}