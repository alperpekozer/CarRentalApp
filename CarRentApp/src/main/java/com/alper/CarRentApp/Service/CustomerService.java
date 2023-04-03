package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.Customer;
import com.alper.CarRentApp.Repository.view.ICustomerRepository;
import com.alper.CarRentApp.dto.request.SaveCustomerRequestDto;
import com.alper.CarRentApp.mapper.ICustomerMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ServiceManager<Customer,Long> {

    private static ICustomerRepository repository;

    public CustomerService(ICustomerRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Customer save(SaveCustomerRequestDto dto){
        return save(ICustomerMapper.INSTANCE.toCustomer(dto));
    }
}
