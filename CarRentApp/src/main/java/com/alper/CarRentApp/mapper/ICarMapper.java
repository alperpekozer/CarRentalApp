package com.alper.CarRentApp.mapper;

import com.alper.CarRentApp.Repository.entity.Car;
import com.alper.CarRentApp.dto.request.SaveCarRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ICarMapper {

    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);

    Car toCar(final SaveCarRequestDto dto);
}
