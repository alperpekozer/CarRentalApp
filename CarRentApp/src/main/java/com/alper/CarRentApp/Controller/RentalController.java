package com.alper.CarRentApp.Controller;

import com.alper.CarRentApp.Repository.entity.Rental;
import com.alper.CarRentApp.Service.RentalService;
import com.alper.CarRentApp.dto.request.SaveRentalRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alper.CarRentApp.constants.EndPointList.*;
@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @PostMapping(SAVE)
    public ResponseEntity<Rental> saveRental(SaveRentalRequestDto dto){
        return ResponseEntity.ok(rentalService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Rental>> findAll(){
        return ResponseEntity.ok(rentalService.findAll());
    }


}
