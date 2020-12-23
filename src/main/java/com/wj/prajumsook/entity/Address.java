package com.wj.prajumsook.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Address
{   private String building;
    private double[] coord;
    private String street;
    private String zipcode;
}
