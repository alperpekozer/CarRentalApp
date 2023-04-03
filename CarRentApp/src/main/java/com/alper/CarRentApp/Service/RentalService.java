package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.Rental;
import com.alper.CarRentApp.Repository.view.IRentalRepository;
import com.alper.CarRentApp.dto.request.SaveRentalRequestDto;
import com.alper.CarRentApp.mapper.ICustomerMapper;
import com.alper.CarRentApp.mapper.IRentalMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class RentalService extends ServiceManager<Rental,Long> {

    private final IRentalRepository repository;

    public RentalService(IRentalRepository repository){
        super(repository);
        this.repository= repository;
    }
    @PostMapping("/save")
    public Rental save(SaveRentalRequestDto dto){
        return save(IRentalMapper.INSTANCE.toRental(dto));
    }

}
