package com.wj.prajumsook.repository;


import com.wj.prajumsook.entity.Restaurant;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

public interface RestaurantRepository extends RxJava2CrudRepository<Restaurant, String>
{
}