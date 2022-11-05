package com.example.weatherfetcher1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.UUID

class WeatherScreen : AppCompatActivity() {
    private val weatherPresenter = WeatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_weatherscreen)

        val tvTemperature  = findViewById<TextView>(R.id.tvTemperature)
        tvTemperature.text  = weatherPresenter.getweather(UUID.randomUUID().toString())
    }
}