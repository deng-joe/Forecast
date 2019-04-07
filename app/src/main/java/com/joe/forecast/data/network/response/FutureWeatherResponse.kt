package com.joe.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.joe.forecast.data.db.entity.current.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeather: ForecastDaysContainer,
    val location: WeatherLocation
)
