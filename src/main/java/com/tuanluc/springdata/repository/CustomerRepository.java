package com.tuanluc.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tuanluc.springdata.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}