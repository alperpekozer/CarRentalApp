package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
