package com.joe.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.joe.forecast.data.db.entity.CurrentWeather
import com.joe.forecast.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeather: CurrentWeather,
    val location: WeatherLocation
)
