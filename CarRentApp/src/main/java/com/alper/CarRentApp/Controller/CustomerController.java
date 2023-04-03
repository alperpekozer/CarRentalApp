package com.alper.CarRentApp.Controller;

import com.alper.CarRentApp.Repository.entity.Customer;
import com.alper.CarRentApp.Service.CustomerService;
import com.alper.CarRentApp.dto.request.SaveCustomerRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alper.CarRentApp.constants.EndPointList.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {


    private final CustomerService customerService;
    @PostMapping(SAVE)
    ResponseEntity<Customer> save(SaveCustomerRequestDto dto){
        return ResponseEntity.ok(customerService.save(dto));
    }
    @GetMapping(FIND_ALL)
    ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }


}
