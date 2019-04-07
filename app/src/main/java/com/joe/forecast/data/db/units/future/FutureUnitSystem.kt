package com.joe.forecast.data.db.units.future

import org.threeten.bp.LocalDate

interface FutureUnitSystem {
    val date: LocalDate
    val avgTemperature: Double
    val conditionText: String
    val conditionIcon: String
}
