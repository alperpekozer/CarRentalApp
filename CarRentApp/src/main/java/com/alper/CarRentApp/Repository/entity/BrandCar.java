package com.alper.CarRentApp.Repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblbrandcar")
public class BrandCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    Long brandid;

    Long carid;
}
