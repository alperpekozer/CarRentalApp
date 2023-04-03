package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.BrandCar;
import com.alper.CarRentApp.Repository.entity.Car;
import com.alper.CarRentApp.Repository.entity.CarColor;
import com.alper.CarRentApp.Repository.view.ICarRepository;
import com.alper.CarRentApp.dto.request.SaveCarRequestDto;
import com.alper.CarRentApp.mapper.ICarMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CarService extends ServiceManager<Car,Long> {

    private final ICarRepository repository;

    private CarColorService carColorService;

    public CarService(ICarRepository repository, CarColorService carColorService){
        super(repository);
        this.repository=repository;
        this.carColorService=carColorService;
    }

    public Car save(SaveCarRequestDto dto){
       Car car = save(ICarMapper.INSTANCE.toCar(dto));

       Long colorid = dto.getColorids();
        CarColor carColor = CarColor.builder()
                .carid(car.getId())
                .colorid(colorid)
                .build();
        carColorService.save(carColor);

        Long brandid = dto.getBrandids();
        BrandCar brandCar = BrandCar.builder()
                .carid(car.getId())
                .brandid(brandid)
                .build();


       return car;
    }
}
