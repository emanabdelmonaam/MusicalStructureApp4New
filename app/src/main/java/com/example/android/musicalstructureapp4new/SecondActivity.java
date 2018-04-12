package com.example.android.musicalstructureapp4new;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton autostrad = (ImageButton) findViewById(R.id.autos);

        // Set a click listener on that View
        autostrad.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent autostrad = new Intent(SecondActivity.this, AutostratActivity.class);

                // Start the new activity
                startActivity(autostrad);
            }
        });

          /*
         Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton azizMarka = (ImageButton) findViewById(R.id.aziz);

        // Set a click listener on that View
        azizMarka.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent azizMarkaIntent = new Intent(SecondActivity.this, AzizMarkaActivity.class);

                // Start the new activity
                startActivity(azizMarkaIntent);
            }
        });

        /*
        * Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton cairokyBand = (ImageButton) findViewById(R.id.cairoky);

        // Set a click listener on that View
        cairokyBand.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cairokyBandIntent = new Intent(SecondActivity.this, CairokyBandActivity.class);

                // Start the new activity
                startActivity(cairokyBandIntent);
            }
        });

         /*
         *Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton elmorabaa = (ImageButton) findViewById(R.id.elmorabaa);

        // Set a click listener on that View
        elmorabaa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent elmorabaaIntent = new Intent(SecondActivity.this, ElmorabaaActivity.class);

                // Start the new activity
                startActivity(elmorabaaIntent);
            }
        });

        /*
         *Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton hamzaNamera = (ImageButton) findViewById(R.id.hamza);

        // Set a click listener on that View
        hamzaNamera.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hamzaIntent = new Intent(SecondActivity.this, HamzaActivity.class);

                // Start the new activity
                startActivity(hamzaIntent);
            }
        });

        /*
         *Find the View that shows the numbers category as same as xml
         objectDataType  variableName = new
        */
        ImageButton masarEgbary = (ImageButton) findViewById(R.id.masar);

        // Set a click listener on that View
        masarEgbary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent masarEgbaryIntent = new Intent(SecondActivity.this, MasarActivity.class);

                // Start the new activity
                startActivity(masarEgbaryIntent);
            }
        });
    }

}