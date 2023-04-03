package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentalRepository extends JpaRepository<Rental,Long> {
}
