package com.joe.forecast.data.repository

import androidx.lifecycle.LiveData
import com.joe.forecast.data.db.entity.current.WeatherLocation
import com.joe.forecast.data.db.units.current.UnitSystem

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSystem>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}
