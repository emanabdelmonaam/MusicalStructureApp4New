package com.example.android.musicalstructureapp4new;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ListenToSong extends AppCompatActivity {

    //@BindView(R.id.playerList)
    private ImageButton goBack;
    private MediaPlayer mlisten;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listen_song_activity);

        ImageButton goBack = (ImageButton) findViewById(R.id.playerList);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Stops everything to prevent issues
                Intent goBack = new Intent(ListenToSong.this, SecondActivity.class);

                startActivity(goBack);
            }
        });

    }
}