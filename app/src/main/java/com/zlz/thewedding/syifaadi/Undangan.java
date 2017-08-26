package com.zlz.thewedding.syifaadi;

import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zlz on 3/2/2015.
 */

public class Undangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invit);
        MultiDex.install(this);
    }
}