package com.joe.forecast.data.db.units.future

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate

class FutureImperialUnits(
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "avgTempF")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIcon: String
) : FutureUnitSystem
