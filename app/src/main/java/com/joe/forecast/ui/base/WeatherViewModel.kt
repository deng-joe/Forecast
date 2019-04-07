package com.joe.forecast.ui.base

import androidx.lifecycle.ViewModel
import com.joe.forecast.data.provider.UnitProvider
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.UnitSystem
import com.joe.forecast.internal.lazyDeferred

abstract class WeatherViewModel(private val forecastRepository: ForecastRepository, unitProvider: UnitProvider) :
    ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
