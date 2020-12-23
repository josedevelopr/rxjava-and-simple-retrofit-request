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
// Based on :
// https://stackoverflow.com/a/35104080/10936212
// You can also check :
// https://android.jlelse.eu/building-your-own-retrofit-call-adapter-b198169bab69

@Configuration
public class SimpleRestClientConfiguration
{   @Bean
    SimpleFilmApi filmApi()
    {   HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        // For this example, I'm using a free api provided on https://ghibliapi.herokuapp.com/#section/Helper-Libraries/Elixir
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ghibliapi.herokuapp.com")
                .client(client)
                .addCallAdapterFactory(SynchronousCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(SimpleFilmApi.class);
    }
}
