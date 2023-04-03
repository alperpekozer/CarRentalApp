package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.BrandCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandCarRespository extends JpaRepository<BrandCar,Long> {
}
