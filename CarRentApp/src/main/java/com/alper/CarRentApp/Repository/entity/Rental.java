package com.alper.CarRentApp.Repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblrental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    int rentDate;

    Long carids;

    Long customerids;
}
