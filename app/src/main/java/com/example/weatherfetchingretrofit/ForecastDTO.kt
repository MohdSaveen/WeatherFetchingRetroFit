package com.example.weatherfetchingretrofit

import java.io.Serializable

data class ForecastDTO(
	val forecastday: List<ForecastdayDTO?>? = null
)