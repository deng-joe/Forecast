package com.joe.forecast.data.db.units.future.detail

import org.threeten.bp.LocalDate

interface DetailFutureWeather {
    val date: LocalDate
    val maxTemperature: Double
    val minTemperature: Double
    val avgTemperature: Double
    val conditionText: String
    val conditionIcon: String
    val maxWindSpeed: Double
    val totalPrecipitation: Double
    val avgVisibility: Double
    val uv: Double
}
