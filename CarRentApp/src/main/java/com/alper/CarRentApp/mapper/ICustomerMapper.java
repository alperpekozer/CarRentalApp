package com.alper.CarRentApp.mapper;

import com.alper.CarRentApp.Repository.entity.Customer;
import com.alper.CarRentApp.dto.request.SaveCustomerRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ICustomerMapper {

    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    Customer toCustomer(final SaveCustomerRequestDto dto);
}
