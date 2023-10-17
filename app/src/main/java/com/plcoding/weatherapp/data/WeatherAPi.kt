package com.plcoding.weatherapp.data

import retrofit2.http.Query

interface WeatherAPi {

    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitutde") long: Double
    )
}