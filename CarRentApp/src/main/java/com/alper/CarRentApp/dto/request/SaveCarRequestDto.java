package com.alper.CarRentApp.dto.request;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveCarRequestDto {

    String name;
    int modelYear;
    int dailyPrice;

    Long colorids;

    Long brandids;
}
