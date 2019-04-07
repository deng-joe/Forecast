package com.joe.forecast.data.repository

import androidx.lifecycle.LiveData
import com.joe.forecast.data.db.entity.current.WeatherLocation
import com.joe.forecast.data.db.units.current.UnitSystem
import com.joe.forecast.data.db.units.future.FutureUnitSystem
import org.threeten.bp.LocalDate

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSystem>
    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<FutureUnitSystem>>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}
