package com.example.weatherfetchingretrofit

import java.io.Serializable

data class DayDTO(
	val maxtempC: Any? = null,
	val maxtempF: Any? = null,
	val mintempC: Any? = null,
	val mintempF: Any? = null,
	val avgtempC: Any? = null,
	val avgtempF: Any? = null,
	val maxwindMph: Any? = null,
	val maxwindKph: Any? = null,
	val totalprecipMm: Any? = null,
	val totalprecipIn: Any? = null,
	val avgvisKm: Any? = null,
	val avgvisMiles: Any? = null,
	val avghumidity: Any? = null,
	val dailyWillItRain: Int? = null,
	val dailyChanceOfRain: Int? = null,
	val dailyWillItSnow: Int? = null,
	val dailyChanceOfSnow: Int? = null,
	val condition: ConditionDTO? = null,
	val uv: Any? = null
)