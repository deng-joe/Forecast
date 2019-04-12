package com.joe.forecast.ui.weather.future.detail

import com.joe.forecast.data.provider.UnitProvider
import com.joe.forecast.data.repository.ForecastRepository
import com.joe.forecast.internal.lazyDeferred
import com.joe.forecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {
    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
