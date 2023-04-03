package com.alper.CarRentApp.mapper;

import com.alper.CarRentApp.Repository.entity.Color;
import com.alper.CarRentApp.dto.request.SaveColorRequestDpo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IColorMapper {

    IColorMapper INSTANCE = Mappers.getMapper(IColorMapper.class);

    Color toColor(final SaveColorRequestDpo dto);
}
