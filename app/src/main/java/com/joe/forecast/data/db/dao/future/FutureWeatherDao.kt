package com.joe.forecast.data.db.dao.future

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.joe.forecast.data.db.entity.future.FutureWeather
import com.joe.forecast.data.db.units.future.FutureImperialUnits
import com.joe.forecast.data.db.units.future.FutureMetricUnits
import org.threeten.bp.LocalDate

@Dao
interface FutureWeatherDao {
    @Insert(onConflict = REPLACE)
    fun insert(futureWeather: List<FutureWeather>)

    @Query("SELECT * FROM future_weather WHERE date(date) >= date(:startDate)")
    fun getForecastsMetric(startDate: LocalDate): LiveData<List<FutureMetricUnits>>

    @Query("SELECT * FROM future_weather WHERE date(date) >= date(:startDate)")
    fun getForecastsImperial(startDate: LocalDate): LiveData<List<FutureImperialUnits>>

    @Query("SELECT count(id) FROM future_weather WHERE date(date) >= date(:startDate)")
    fun countFutureWeather(startDate: LocalDate): Int

    @Query("DELETE FROM future_weather WHERE date(date) < date(:firstDateToKeep)")
    fun deleteOldEntries(firstDateToKeep: LocalDate)
}
