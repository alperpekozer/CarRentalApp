package com.alper.CarRentApp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveRentalRequestDto {

    int rentDate;

    Long carids;

    Long customerids;
}
