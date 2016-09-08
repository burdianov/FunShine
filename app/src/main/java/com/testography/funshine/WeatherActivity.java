package com.testography.funshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {

    final String URL_BASE = "http://api.openweathermap.org/data/2.5/forecast";
    final String URL_COORD = "/?lat=";
    final String URL_API_KEY = "&APPID=15694f7dfc46ad9ed54037392ddf05be";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


    }
}
