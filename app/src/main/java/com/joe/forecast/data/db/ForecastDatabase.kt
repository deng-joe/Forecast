package com.joe.forecast.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.joe.forecast.data.db.dao.current.CurrentWeatherDao
import com.joe.forecast.data.db.dao.current.WeatherLocationDao
import com.joe.forecast.data.db.dao.future.FutureWeatherDao
import com.joe.forecast.data.db.entity.current.CurrentWeather
import com.joe.forecast.data.db.entity.current.WeatherLocation
import com.joe.forecast.data.db.utils.LocalDateConverter

@Database(entities = [CurrentWeather::class, WeatherLocation::class], version = 1, exportSchema = false)
@TypeConverters(LocalDateConverter::class)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun futureWeatherDao(): FutureWeatherDao
    abstract fun weatherLocationDao(): WeatherLocationDao

    companion object {
        @Volatile
        private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, ForecastDatabase::class.java, "forecast_database").build()
    }
}
