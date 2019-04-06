package com.joe.forecast.ui.weather.current

import androidx.lifecycle.ViewModel
import com.joe.forecast.data.provider.UnitProvider
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.UnitSystem
import com.joe.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository, unitProvider: UnitProvider) :
    ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
