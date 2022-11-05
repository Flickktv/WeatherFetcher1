package com.example.weatherfetcher1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.textView2)
        textViewHello.text = "Hello from code"

        val btnWeatherScreen = findViewById<Button>(R.id.btnWeather)
        btnWeatherScreen.setOnClickListener {
            Intent(this, WeatherScreen::class.java).also { startActivity(it) }
        }
    }
}