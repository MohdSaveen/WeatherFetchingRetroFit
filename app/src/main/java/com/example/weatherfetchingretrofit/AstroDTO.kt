package com.example.weatherfetchingretrofit

import java.io.Serializable

data class AstroDTO(
	val sunrise: String? = null,
	val sunset: String? = null,
	val moonrise: String? = null,
	val moonset: String? = null,
	val moonPhase: String? = null,
	val moonIllumination: String? = null
)