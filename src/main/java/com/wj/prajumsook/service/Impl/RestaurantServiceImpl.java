package com.wj.prajumsook.service.Impl;

import com.wj.prajumsook.entity.Restaurant;
import com.wj.prajumsook.repository.RestaurantRepository;
import com.wj.prajumsook.service.RestaurantService;
import io.reactivex.Observable;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService
{   private final RestaurantRepository restaurantRepository;

    @Override
    public Observable<Restaurant> findRestaurantsWhereZipAndCuisine(String zip, String cuisine)
    {
        return restaurantRepository.findAll()
                                   .toObservable()
                                   .filter(restaurant -> restaurant.getAddress().getZipcode().equals(zip))
                                   .filter(restaurant -> restaurant.getCuisine().equals(cuisine));
    }

    @Override
    public Observable<Restaurant> findRestaurantsNameStartsWithAndNameLengthLessThan(String startsWith, int length)
    {
        return null;
    }
}
