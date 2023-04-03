package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.CarColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarColorRepository extends JpaRepository<CarColor,Long> {
}
