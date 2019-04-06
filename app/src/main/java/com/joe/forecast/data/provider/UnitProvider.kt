package com.joe.forecast.data.provider

import com.joe.forecast.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}
