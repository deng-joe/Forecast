package com.joe.forecast.data.network.response

import com.joe.forecast.data.db.entity.CurrentWeather
import com.joe.forecast.data.db.entity.Location

data class CurrentWeatherResponse(
    val current: CurrentWeather,
    val location: Location
)
