package com.alper.CarRentApp.Controller;

import com.alper.CarRentApp.Repository.entity.Car;
import com.alper.CarRentApp.Service.CarService;
import com.alper.CarRentApp.dto.request.SaveCarRequestDto;
import com.alper.CarRentApp.mapper.ICarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.alper.CarRentApp.constants.EndPointList.*;

import javax.servlet.http.PushBuilder;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(CAR)
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping(SAVE)
    public ResponseEntity<Car> saveCar(@RequestBody @Valid SaveCarRequestDto dto){

       return ResponseEntity.ok(carService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll(){
        return ResponseEntity.ok(carService.findAll());
    }
}
