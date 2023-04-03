package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.CarColor;
import com.alper.CarRentApp.Repository.view.ICarColorRepository;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CarColorService extends ServiceManager<CarColor,Long> {

    private final ICarColorRepository repository;

    public CarColorService(ICarColorRepository repository){
        super(repository);
        this.repository=repository;

    }

}
