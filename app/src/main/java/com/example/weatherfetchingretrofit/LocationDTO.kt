package com.example.weatherfetchingretrofit

import java.io.Serializable

data class LocationDTO(
	val name: String? = null,
	val region: String? = null,
	val country: String? = null,
	val lat: Any? = null,
	val lon: Any? = null,
	val tzId: String? = null,
	val localtimeEpoch: Int? = null,
	val localtime: String? = null
)