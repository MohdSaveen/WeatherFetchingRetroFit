package com.example.weatherfetchingretrofit

import java.io.Serializable

data class ConditionDTO(
	val text: String? = null,
	val icon: String? = null,
	val code: Int? = null
)