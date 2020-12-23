package com.wj.prajumsook.controller;

import com.wj.prajumsook.entity.Restaurant;
import com.wj.prajumsook.service.RestaurantService;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController
{   @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/zipAndCuisine/{zip}/{cuisine}")
    public Observable<Restaurant> findAll(@PathVariable(value="zip") String zip,
                                          @PathVariable(value = "cuisine") String cuisine)
    {
        return restaurantService.findRestaurantsWhereZipAndCuisine(zip, cuisine);
    }
}
