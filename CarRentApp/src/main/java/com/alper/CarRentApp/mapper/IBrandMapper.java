package com.alper.CarRentApp.mapper;

import com.alper.CarRentApp.Repository.entity.Brand;
import com.alper.CarRentApp.dto.request.SaveBrandRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IBrandMapper {

    IBrandMapper INSTANCE = Mappers.getMapper(IBrandMapper.class);

    Brand toBrand(final SaveBrandRequestDto dto);
}
