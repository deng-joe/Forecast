package com.joe.forecast.data.repository

import androidx.lifecycle.LiveData
import com.joe.forecast.data.db.entity.WeatherLocation
import com.joe.forecast.data.db.units.UnitSystem

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSystem>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}
