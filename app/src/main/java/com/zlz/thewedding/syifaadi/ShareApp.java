package com.zlz.thewedding.syifaadi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zlz on 23-04-2015.
 */
public class ShareApp extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_app);
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT, "Download Undangan Digital Pernikahan Vera & Soni (06 Februari 2016 di playstore : \n" +
                "https://play.google.com/store/apps/details?id=com.zlz.thewedding.verasoni");
        startActivity(Intent.createChooser(share, "Bagikan Aplikasi ini"));


    }
}

