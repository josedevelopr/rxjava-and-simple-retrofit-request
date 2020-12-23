package com.wj.prajumsook.service;

import com.wj.prajumsook.entity.Restaurant;
import io.reactivex.Observable;

public interface RestaurantService
{   public Observable<Restaurant> findRestaurantsWhereZipAndCuisine(String zip, String cuisine);
    public Observable<Restaurant> findRestaurantsNameStartsWithAndNameLengthLessThan(String startsWith, int length);
}
