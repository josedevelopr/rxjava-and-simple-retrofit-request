package com.wj.prajumsook.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Grade
{   private Date date;
    private String grade;
    private double score;
}