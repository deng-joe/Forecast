package com.joe.forecast.data.db.units.future.detail

import androidx.room.ColumnInfo
import org.threeten.bp.LocalDate

class MetricDetailFutureWeather(
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "maxtempC")
    override val maxTemperature: Double,
    @ColumnInfo(name = "mintempC")
    override val minTemperature: Double,
    @ColumnInfo(name = "avgtempC")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIcon: String,
    @ColumnInfo(name = "maxwindKph")
    override val maxWindSpeed: Double,
    @ColumnInfo(name = "totalprecipMm")
    override val totalPrecipitation: Double,
    @ColumnInfo(name = "avgvisKm")
    override val avgVisibility: Double,
    @ColumnInfo(name = "uv")
    override val uv: Double
) : DetailFutureWeather
