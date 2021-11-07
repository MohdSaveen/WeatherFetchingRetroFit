package com.example.weatherfetchingretrofit

import java.io.Serializable

data class ForecastdayDTO(
	val date: String? = null,
	val dateEpoch: Int? = null,
	val day: DayDTO? = null,
	val astro: AstroDTO? = null,
	val hour: List<HourDTO?>? = null
)