package com.alper.CarRentApp.Controller;

import com.alper.CarRentApp.Repository.entity.Brand;
import com.alper.CarRentApp.Service.BrandService;
import com.alper.CarRentApp.dto.request.SaveBrandRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alper.CarRentApp.constants.EndPointList.*;

import java.util.List;

import static com.alper.CarRentApp.constants.EndPointList.*;

@RestController
@RequestMapping(BRAND)
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @PostMapping(SAVE)
    ResponseEntity<Brand> saveBrand(SaveBrandRequestDto dto){

        return ResponseEntity.ok(brandService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Brand>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }
}


