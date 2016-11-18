package com.we_are_infinity.facer.UI.ACTIVITIES;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.we_are_infinity.facer.LOGIC.MODEL.WEBSERVICE.Betaface;
import com.we_are_infinity.facer.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    Retrofit x = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://www.betafaceapi.com/service_json.svc/").build();
    Betaface betaface = x.create(Betaface.class);
//    Betaface pixplorer = b.baseUrl("http://api.pixplorer.co.uk").build().create(Betaface.class);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
