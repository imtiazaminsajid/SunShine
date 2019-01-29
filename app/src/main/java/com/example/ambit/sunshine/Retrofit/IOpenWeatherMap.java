package com.example.ambit.sunshine.Retrofit;

import com.example.ambit.sunshine.Model.WeatherForecastResult;
import com.example.ambit.sunshine.Model.WeatherResult;
import com.google.android.gms.common.data.DataBufferObserver;

import java.util.Observer;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);

    @GET("forাcast")
    Observable<WeatherForecastResult> getWeatherForecastByLatLng(@Query("lat") String lat,
                                                                 @Query("lon") String lng,
                                                                 @Query("appid") String appid,
                                                                 @Query("units") String unit);
}
