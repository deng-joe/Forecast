package com.joe.forecast.data.db.units.current

interface UnitSystem {
    val temperature: Double
    val conditionText: String
    val conditionIcon: String
    val windSpeed: Double
    val windDirection: String
    val precipitation: Double
    val feelsLikeTemperature: Double
    val visibility: Double
}
