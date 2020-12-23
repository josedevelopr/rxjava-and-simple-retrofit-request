package com.wj.prajumsook.configuration;

import com.wj.prajumsook.service.FilmApi;
import com.wj.prajumsook.service.SimpleFilmApi;
import com.wj.prajumsook.util.SynchronousCallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class SimpleRestClientConfiguration
{   @Bean
    SimpleFilmApi filmApi()
    {   HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ghibliapi.herokuapp.com")
                .client(client)
                .addCallAdapterFactory(SynchronousCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(SimpleFilmApi.class);
    }
}
