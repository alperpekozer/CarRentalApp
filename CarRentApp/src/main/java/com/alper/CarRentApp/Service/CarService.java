package com.alper.CarRentApp.Service;

import com.alper.CarRentApp.Repository.entity.BrandCar;
import com.alper.CarRentApp.Repository.entity.Car;
import com.alper.CarRentApp.Repository.entity.CarColor;
import com.alper.CarRentApp.Repository.view.ICarRepository;
import com.alper.CarRentApp.dto.request.SaveCarRequestDto;
import com.alper.CarRentApp.exception.CarRentAppException;
import com.alper.CarRentApp.exception.ErrorType;
import com.alper.CarRentApp.mapper.ICarMapper;
import com.alper.CarRentApp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService extends ServiceManager<Car,Long> {

    private final ICarRepository repository;

    private CarColorService carColorService;

    public CarService(ICarRepository repository, CarColorService carColorService) {
        super(repository);
        this.repository = repository;
        this.carColorService = carColorService;
    }

    public Car save(SaveCarRequestDto dto) {
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

    public List<Car> findAllByNameStartingWithIgnoreCase(String name) {
        List<Car> car = repository.findAllByNameStartingWithIgnoreCase(name);

        return car;
    }

    public List<Car> findAllByBrandids(Long id) {
        List<Car> car = repository.findAllByBrandids(id);
        if (car.isEmpty()) {
            throw new CarRentAppException(ErrorType.CAR_NOT_FOUND);
        }
        return car;
    }

    public List<Car> findAllByColorids(Long colorid) {
        List<Car> car = repository.findAllByColorids(colorid);
        if (car.isEmpty()) {
            throw new CarRentAppException(ErrorType.BRAND_NOT_FOUND);
        }
        return car;
    }

    public List<Car> findAllByColoridsAndBrandids(Long colorids, Long brandids) {
        List<Car> car = repository.findAllByColoridsAndBrandids(colorids, brandids);
        if (car.isEmpty()) {
            throw new CarRentAppException(ErrorType.COLOR_OR_BRAND_NOT_FOUND);

        }
        return car;
    }

    public List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice) {
        List<Car> car = repository.findAllByDailyPriceLessThanEqual(dailyPrice);
        if (car.isEmpty()) {
            throw new CarRentAppException(ErrorType.DAILY_PRICE_NOT_FOUND);

        }

        return car;
    }
}

