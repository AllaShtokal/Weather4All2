package com.allashtokal.weather4all.Retrofit;

import com.allashtokal.weather4all.Model.WeatherForecastResult;
import com.allashtokal.weather4all.Model.WeatherResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable <WeatherResult> getWeatherByLatLng (@Query("lat") String lat,
                                                   @Query("lon") String lng,
                                                   @Query("appid")String appid,
                                                   @Query("units")String unit);
    //declare new end-point
    @GET("weather")
    Observable <WeatherResult> getWeatherByCityName (@Query("lat") String cityName,
                                                     @Query("appid")String appid,
                                                     @Query("units")String unit);


 //new end-point
    @GET("forecast")
    Observable <WeatherForecastResult> getForecastWeatherByLatLng (@Query("lat") String lat,
                                                           @Query("lon") String lng,
                                                           @Query("appid")String appid,
                                                           @Query("units")String unit);
}