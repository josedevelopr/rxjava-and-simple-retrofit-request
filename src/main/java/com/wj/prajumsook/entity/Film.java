package com.wj.prajumsook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film
{   private String id;
    private String title;
    private String description;
    private String director;
    private String producer;
    private int release_date;
    private int rt_score;
}