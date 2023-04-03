package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.BrandCar;
import com.alper.CarRentApp.Repository.view.IBrandCarRespository;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BrandCarService extends ServiceManager<BrandCar,Long> {

    private final IBrandCarRespository respository;


    public BrandCarService(IBrandCarRespository respository){
        super(respository);
        this.respository=respository;
    }

}
