package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepository extends JpaRepository<Brand,Long> {
}
