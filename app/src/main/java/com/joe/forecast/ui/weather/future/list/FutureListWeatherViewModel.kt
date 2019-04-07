package com.joe.forecast.ui.weather.future.list

import com.joe.forecast.data.provider.UnitProvider
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.lazyDeferred
import com.joe.forecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
