package com.testography.funshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class WeatherActivity extends AppCompatActivity {

    final String URL_BASE = "http://api.openweathermap.org/data/2.5/forecast";
    final String URL_COORD = "/?lat=26.200818&lon=127.669632";
    final String URL_UNITS = "&units=metric";
    final String URL_API_KEY = "&APPID=15694f7dfc46ad9ed54037392ddf05be";
    // 26.200818, 127.669632

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        final String url = URL_BASE + URL_COORD + URL_UNITS + URL_API_KEY;

        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request
                .Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.v("FUN", "RES: " + response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("FUN", "Err: " + error.getLocalizedMessage());
            }
        });
        Volley.newRequestQueue(this).add(jsonObjectRequest);
    }
}
