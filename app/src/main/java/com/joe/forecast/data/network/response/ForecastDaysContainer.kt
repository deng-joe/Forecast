package com.joe.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.joe.forecast.data.db.entity.future.FutureWeather

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeather>
)
