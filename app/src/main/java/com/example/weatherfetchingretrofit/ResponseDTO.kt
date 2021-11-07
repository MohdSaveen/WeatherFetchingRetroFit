package com.example.weatherfetchingretrofit

import java.io.Serializable

data class ResponseDTO(
	val location: LocationDTO? = null,
	val current: CurrentDTO? = null,
	val forecast: ForecastDTO? = null
)