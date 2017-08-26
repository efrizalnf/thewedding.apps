package com.zlz.thewedding.syifaadi;

import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zlz on 3/2/2015.
 */

public class Peta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peta);
        MultiDex.install(this);
    }
}