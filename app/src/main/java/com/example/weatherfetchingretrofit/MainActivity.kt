package com.example.weatherfetchingretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivity : AppCompatActivity(), CoroutineScope by MainScope(){


      val key:String="47e0e7568fd74f8394e200926210211"
      val q="London"
     val days : Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch (Dispatchers.Main) {
            try {
                val response =ApiAdapter.apiServices.getUserDetails(key,q,days,"no","no")

                if (response.isSuccessful && response.body() !=null){
                    val data =response.body()!!
                    data.apply {
                        nameShowingView.text = location?.name
                        temp_cShowingView.text = current?.tempC.toString()
                        temp_FShowing.text = current?.tempF.toString()
                        WindMphShowing.text = current?.windMph.toString()
                        WindKphShowing.text = current?.windKph.toString()
                        WindDir.text = current?.windDir
                        FeelsLikeCShowing.text = current?.feelslikeC.toString()
                        FeelsLike_FShowing.text = current?.feelslikeF.toString()
                        DateShowing.text = forecast?.forecastday?.get(1)?.date
                        TempMaxShowing.text =
                            forecast?.forecastday?.get(1)?.day?.maxtempF.toString()
                        TempMinShowing.text =
                            forecast?.forecastday?.get(1)?.day?.mintempF.toString()
                        SunriseShowing.text = forecast?.forecastday?.get(1)?.astro?.sunrise
                    }
                }else{
                    Toast.makeText(this@MainActivity,"Error Occurreddd :${response.message()}",Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception){
                Toast.makeText(this@MainActivity,"Error Occurred: ${e.message}",Toast.LENGTH_SHORT).show()
            }

        }
    }
}