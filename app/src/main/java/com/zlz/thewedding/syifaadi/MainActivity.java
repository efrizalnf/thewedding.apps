package com.zlz.thewedding.syifaadi;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.eyro.mesosfer.Mesosfer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    GridView gridView;
    ArrayList<GridItem> gridArray = new ArrayList<>();
    CustomGridAdapter customGridAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// enable Mesosfer push notification
        Mesosfer.setPushNotification(true);

        // initialize Mesosfer SDK
        Mesosfer.initialize(this, "H9JhVqhUr6","aS3SAV5Ml6zAM35ruwe9tCTxvd7CpWCm");
        mainMenu();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Download Undangan Pernikahan Digital Syifa & Adi (04 Desember 2016) di playstore : \n" +
                        "https://play.google.com/store/apps/details?id=com.zlz.thewedding.syifaadi || Order this Apps : PIN 7EA2A8D2 / WA 085722921311");
                startActivity(Intent.createChooser(share, "Bagikan Undangan.."));
                Snackbar.make(view, "Bagikan Undangan...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void mainMenu() {
        if (getIntent().getBooleanExtra("EXIT", false) == true) {
            finish();

        }

        // set grid view item

        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_invit);
        Bitmap galleryIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_chat);
        Bitmap mapsOffIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_mapsoff);
        Bitmap mapsOnIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_maps);
        Bitmap aboutIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_about);
        Bitmap exitIcon = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_power);


        gridArray.add(new GridItem(homeIcon, "Undangan"));
        gridArray.add(new GridItem(galleryIcon, "Ucapkan Selamat"));
        gridArray.add(new GridItem(mapsOffIcon, "Peta Image"));
        gridArray.add(new GridItem(mapsOnIcon, "Peta G-Maps"));
        gridArray.add(new GridItem(aboutIcon, "About Apps"));
        gridArray.add(new GridItem(exitIcon, "Keluar"));

        gridView = (GridView) findViewById(R.id.grid_menu);
        customGridAdapter = new CustomGridAdapter(this, R.layout.grid_row,
                gridArray);

        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                if (gridArray.get(arg2).getTitle().toString()
                        .equals("Undangan")
                        ) {
                    // Toast.makeText(getApplicationContext(),
                    // "VIEW : " + gridArray.get(arg2).getTitle(),
                    // Toast.LENGTH_SHORT).show();
                    Intent Home = new Intent(getApplicationContext(),
                            Undangan.class);
                    startActivity(Home);
                } else if (gridArray.get(arg2).getTitle().toString()
                        .equals("Ucapkan Selamat")) {
                    // Toast.makeText(getApplicationContext(),
                    // "VIEW : " + gridArray.get(arg2).getTitle(),
                    // Toast.LENGTH_SHORT).show();

                    Intent Maps = new Intent(getApplicationContext(),
                            ChatActivity.class);
                    startActivity(Maps);
                } else if (gridArray.get(arg2).getTitle().toString()
                        .equals("Peta Image")) {
                    // Toast.makeText(getApplicationContext(),
                    // "VIEW : " + gridArray.get(arg2).getTitle(),
                    // Toast.LENGTH_SHORT).show();
                    Intent Maps = new Intent(getApplicationContext(),
                            Peta.class);
                    startActivity(Maps);
                } else if (gridArray.get(arg2).getTitle().toString()
                        .equals("Peta G-Maps")) {
                    // Toast.makeText(getApplicationContext(),
                    // "VIEW : " + gridArray.get(arg2).getTitle(),
                    // Toast.LENGTH_SHORT).show();
                    Intent Maps = new Intent(getApplicationContext(),
                            MapsActivity.class);
                    startActivity(Maps);
                } else if (gridArray.get(arg2).getTitle().toString()
                        .equals("About Apps")) {
                    // Toast.makeText(getApplicationContext(),
                    // "VIEW : " + gridArray.get(arg2).getTitle(),
                    // Toast.LENGTH_SHORT).show();
//                    Intent Maps = new Intent(getApplicationContext(),
//                            ImagesLoad.class);
//                    startActivity(Maps);
                    final Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.about);
                    dialog.setTitle("About Apps");

                    // set the custom dialog components - text, image and button
                    TextView text = (TextView) dialog.findViewById(R.id.text);
                    text.setGravity(Gravity.CENTER);
                    text.setText("\n" +
                            "\n" +
                            "بَارَكَ اللهُ لَكَ وَبَارَكَ عَلَيْكَ وَجَمَعَ بَيْنَكُمَا فِى خَيْرٍ" +
                            "\n" +
                            "\n" +
                            "Syifa & Adi \n" +
                            "04 Desember 2016\n" +
                            "\n" +
                            "\n" +
                            "For Order : \n" +
                            "PIN : 7EA2A8D2\n" +
                            "WA : +6285722921311\n" +
                            "eMail : ondabuzz9@gmail.com\n" +
                            "www.everyzalz.blogspot.com\n" +
                            "\n" +
                            "-zalzondabuzz-\n" +
                            "2016" +
                            "\n" +
                            "\n"
                    );

                    dialog.show();
                } else if (gridArray.get(arg2).getTitle().toString()
                        .equals("Keluar")) {
                    Intent intent = new Intent(getApplicationContext(),
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("EXIT", true);
                    startActivity(intent);
                }

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
