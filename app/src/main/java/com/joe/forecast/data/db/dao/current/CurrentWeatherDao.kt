package com.joe.forecast.data.db.dao.current

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.joe.forecast.data.db.entity.current.CURRENT_WEATHER_ID
import com.joe.forecast.data.db.entity.current.CurrentWeather
import com.joe.forecast.data.db.units.current.ImperialUnits
import com.joe.forecast.data.db.units.current.MetricUnits

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = REPLACE)
    fun upsert(currentWeather: CurrentWeather)

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricUnits>

    @Query("SELECT * FROM current_weather WHERE id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialUnits>
}
