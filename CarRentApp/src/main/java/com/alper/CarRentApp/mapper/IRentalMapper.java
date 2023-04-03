package com.alper.CarRentApp.mapper;

import com.alper.CarRentApp.Repository.entity.Rental;
import com.alper.CarRentApp.dto.request.SaveRentalRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IRentalMapper {

    IRentalMapper INSTANCE = Mappers.getMapper(IRentalMapper.class);

    Rental toRental(final SaveRentalRequestDto dto);
}
