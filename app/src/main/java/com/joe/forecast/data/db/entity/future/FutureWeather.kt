package com.joe.forecast.data.db.entity.future

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "future_weather", indices = [Index(value = ["date"], unique = true)])
data class FutureWeather(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val date: String,
    @Embedded
    val day: Day
)
