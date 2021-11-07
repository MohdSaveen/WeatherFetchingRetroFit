package com.example.weatherfetchingretrofit

import java.io.Serializable

data class CurrentDTO(
	val lastUpdatedEpoch: Int? = null,
	val lastUpdated: String? = null,
	val tempC: Any? = null,
	val tempF: Any? = null,
	val isDay: Int? = null,
	val condition: ConditionDTO? = null,
	val windMph: Any? = null,
	val windKph: Any? = null,
	val windDegree: Int? = null,
	val windDir: String? = null,
	val pressureMb: Any? = null,
	val pressureIn: Any? = null,
	val precipMm: Any? = null,
	val precipIn: Any? = null,
	val humidity: Int? = null,
	val cloud: Int? = null,
	val feelslikeC: Any? = null,
	val feelslikeF: Any? = null,
	val visKm: Any? = null,
	val visMiles: Any? = null,
	val uv: Any? = null,
	val gustMph: Any? = null,
	val gustKph: Any? = null
)