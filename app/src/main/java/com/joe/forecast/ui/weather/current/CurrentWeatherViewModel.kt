package com.joe.forecast.ui.weather.current

import androidx.lifecycle.ViewModel
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.UnitSystem
import com.joe.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC  // Get from Settings later

    val isMetric: Boolean
    get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
