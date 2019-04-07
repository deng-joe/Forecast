package com.joe.forecast.ui.weather.current

import com.joe.forecast.data.provider.UnitProvider
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.lazyDeferred
import com.joe.forecast.ui.base.WeatherViewModel

class CurrentWeatherViewModel(private val forecastRepository: ForecastRepository, unitProvider: UnitProvider) :
    WeatherViewModel(forecastRepository, unitProvider) {
    val weather by lazyDeferred {

        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
