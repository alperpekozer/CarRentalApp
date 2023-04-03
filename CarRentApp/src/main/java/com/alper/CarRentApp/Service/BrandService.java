package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.Brand;
import com.alper.CarRentApp.Repository.entity.BrandCar;
import com.alper.CarRentApp.Repository.view.IBrandCarRespository;
import com.alper.CarRentApp.Repository.view.IBrandRepository;
import com.alper.CarRentApp.dto.request.SaveBrandRequestDto;
import com.alper.CarRentApp.mapper.IBrandMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends ServiceManager<Brand,Long> {

    private final IBrandRepository repository;

    private final BrandCarService brandCarService;

    public BrandService(IBrandRepository repository, BrandCarService brandCarService){
        super(repository);
        this.repository=repository;
        this.brandCarService= brandCarService;
    }

    public Brand save(SaveBrandRequestDto dto){
        return save(IBrandMapper.INSTANCE.toBrand(dto));

    }
}
