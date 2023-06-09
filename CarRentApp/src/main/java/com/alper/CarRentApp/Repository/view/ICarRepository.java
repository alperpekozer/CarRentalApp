package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car,Long> {


    List<Car> findAllByNameStartingWithIgnoreCase(String name);

    List<Car> findAllByBrandids(Long id);

    @Query(value = "SELECT * FROM tblcar as car\n" +
            "inner join tblcarcolor as cc on cc.carid=car.id\n" +
            "inner join tblcolor as color on color.id=cc.id\n" +
            "where color.id=1",nativeQuery = true)
    List<Car> findAllByColorids(Long colorids);

    List<Car> findAllByColoridsAndBrandids(Long colorids,Long brandids);

    List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice);
}
