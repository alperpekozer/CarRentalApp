package com.alper.CarRentApp.Repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblcarcolor")
public class CarColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    Long colorid;

    Long carid;
}
