package com.example.weatherfetchingretrofit

import java.io.Serializable

data class HourDTO(
	val timeEpoch: Int? = null,
	val time: String? = null,
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
	val windchillC: Any? = null,
	val windchillF: Any? = null,
	val heatindexC: Any? = null,
	val heatindexF: Any? = null,
	val dewpointC: Any? = null,
	val dewpointF: Any? = null,
	val willItRain: Int? = null,
	val chanceOfRain: Int? = null,
	val willItSnow: Int? = null,
	val chanceOfSnow: Int? = null,
	val visKm: Any? = null,
	val visMiles: Any? = null,
	val gustMph: Any? = null,
	val gustKph: Any? = null,
	val uv: Any? = null
)