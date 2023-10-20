package com.plcoding.weatherapp.domain.weather

import android.service.controls.templates.TemperatureControlTemplate
import java.time.LocalDateTime

data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
