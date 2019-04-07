package com.joe.forecast.data.provider

import com.joe.forecast.data.db.entity.current.WeatherLocation

interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}
