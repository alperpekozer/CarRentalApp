package com.alper.CarRentApp.Controller;

import com.alper.CarRentApp.Repository.entity.Color;
import com.alper.CarRentApp.Service.ColorService;
import com.alper.CarRentApp.dto.request.SaveColorRequestDpo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alper.CarRentApp.constants.EndPointList.*;
@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @PostMapping(SAVE)
    ResponseEntity<Color> saveColor(SaveColorRequestDpo dto){
        return ResponseEntity.ok(colorService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Color>> findAll(){
        return ResponseEntity.ok(colorService.findAll());
    }
}
