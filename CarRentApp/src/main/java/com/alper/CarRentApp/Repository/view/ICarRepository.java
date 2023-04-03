package com.alper.CarRentApp.Repository.view;

import com.alper.CarRentApp.Repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car,Long> {


    List<Car> findAllByNameStartingWithIgnoreCase(String name);

    List<Car> findAllByBrandid(Long id);

    @Query(value = "SELECT * FROM tblcar as car\n" +
            "            inner join tblcarcolor as cc on cc.carid=car.carid\n" +
            "            inner join tblcolor as color on color.colorid=cc.colorid\n" +
            "            where color.colorid=?1",nativeQuery = true)

    List<Car> findAllByColorid(Long colorid);

    List<Car> findCarsWithColorAndBrand();

    List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice);
}
