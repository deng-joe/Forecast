package com.joe.forecast.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.joe.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.joe.forecast.data.db.entity.CurrentWeather
import com.joe.forecast.data.db.units.ImperialUnits
import com.joe.forecast.data.db.units.MetricUnits

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = REPLACE)
    fun upsert(currentWeather: CurrentWeather)

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricUnits>

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialUnits>
}
