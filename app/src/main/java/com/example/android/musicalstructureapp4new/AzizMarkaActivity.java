package com.example.android.musicalstructureapp4new;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.ArrayList;

public class AzizMarkaActivity extends AppCompatActivity {

    MediaPlayer mlisten;
    int currentPosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of bandSong objects
        final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("سمعتك", "2015", R.drawable.aimage1, R.raw.azizsamaaatak));
        bandsSongs.add(new BandSong("ما بقول اسف",  "2012", R.drawable.aimage1, R.raw.outoelaial));
        bandsSongs.add(new BandSong("بدي أرجع علي عمان", "2011", R.drawable.aimage1, R.raw.azizaman));
        bandsSongs.add(new BandSong("بنت الناس",  "2011", R.drawable.aimage1, R.raw.azizyabentelnas));
        bandsSongs.add(new BandSong("هي",  "2014", R.drawable.aimage1, R.raw.azizheia));
        bandsSongs.add(new BandSong("شيخ البلد",  "2011", R.drawable.aimage1, R.raw.azizshakalbalad));;
        bandsSongs.add(new BandSong("يا باي",  "2016", R.drawable.aimage1, R.raw.azizyabai));
        bandsSongs.add(new BandSong("ابكي",  "2011", R.drawable.aimage1, R.raw.azizabky));
        bandsSongs.add(new BandSong("تذكرتك", "2012", R.drawable.aimage1, R.raw.aziztazakartak));
        bandsSongs.add(new BandSong("هلاو",  "2011", R.drawable.aimage1, R.raw.azizhala));
        bandsSongs.add(new BandSong("مين قالك", "2015", R.drawable.aimage1, R.raw.azizmenkalk));
        bandsSongs.add(new BandSong("بنت قوبه",  "2017", R.drawable.aimage1, R.raw.azizbentkawaia));
        bandsSongs.add(new BandSong("لحالي",  "2018", R.drawable.aimage1, R.raw.azizlehaly));
        bandsSongs.add(new BandSong("كتير عادي",  "2018", R.drawable.aimage1, R.raw.azizketerade));
        bandsSongs.add(new BandSong("بداية النهاية",  "2018", R.drawable.aimage1, R.raw.azizbahkylehaly));
        bandsSongs.add(new BandSong(" اه يا حلوه", "2015", R.drawable.aimage1, R.raw.azizahyahalwah));

        //set the BandSongAdapter with listView ID and the arrayList.
        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                BandSong play = bandsSongs.get(position);
                Intent autost = new Intent(AzizMarkaActivity.this, ListenToSong.class);
                startActivity(autost);

                // play song from arrayList

                if (currentPosition != position) {
                    if (mlisten != null) {
                        mlisten.stop();
                    }
                }

                // this would help avoiding lopping song when i click a song is already playing.so it start gian.
                if (mlisten != null) {
                    currentPosition = position;
                    mlisten.stop();
                }

                // start media player when i chose a song.
                mlisten = MediaPlayer.create(AzizMarkaActivity.this, play.getmListenSong());
                mlisten.start();

            }
        });
    }

}