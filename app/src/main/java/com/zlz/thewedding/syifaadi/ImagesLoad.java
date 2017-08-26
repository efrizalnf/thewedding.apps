package com.zlz.thewedding.syifaadi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.zlz.thewedding.syifaadi.touchgallery.GalleryWidget.BasePagerAdapter;
import com.zlz.thewedding.syifaadi.touchgallery.GalleryWidget.GalleryViewPager;
import com.zlz.thewedding.syifaadi.touchgallery.GalleryWidget.UrlPagerAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by zlz on 26-09-2015.
 */
public class ImagesLoad extends Activity {

    private GalleryViewPager mViewPager;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_image);

        String[] urls = {
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/SPN_3281_zpsgnnfopvz.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0005_zpshcanpgky.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0010_zpspmcxxi4o.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0011_zpsltt4w2pw.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0009_zpsi5ygev5k.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0015_zpsqifqm2ln.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0012_zpslpegq3op.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/SPN_3271_zpspxxpyd0b.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/SPN_3267_zpsapvqxlrk.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0007_zpsr7l2wvvx.jpg",
                "http://i293.photobucket.com/albums/mm60/zalzondabuzz/SONI%20VERA/IMG-20160129-WA0006_zps3xcmnb7z.jpg"



        };
        List<String> items = new ArrayList<String>();
        Collections.addAll(items, urls);

        UrlPagerAdapter pagerAdapter = new UrlPagerAdapter(this, items);
        pagerAdapter.setOnItemChangeListener(new BasePagerAdapter.OnItemChangeListener()
        {
            @Override
            public void onItemChange(int currentPosition)
            {
                Toast.makeText(ImagesLoad.this, "Vera & Soni The Wedding Gallery ", Toast.LENGTH_SHORT).show();
            }
        });

        mViewPager = (GalleryViewPager)this.findViewById(R.id.viewer);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(pagerAdapter);

    }
}
