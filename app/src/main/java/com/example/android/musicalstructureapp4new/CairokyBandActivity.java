package com.example.android.musicalstructureapp4new;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class CairokyBandActivity extends AppCompatActivity {

   MediaPlayer mlisten;
   int currentPosition;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.song_list);

       // Create an ArrayList of bandSong objects
       final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
       bandsSongs.add(new BandSong("اثبت مكانك", "2011", R.drawable.cimage1, R.raw.caathpatmakank));
       bandsSongs.add(new BandSong("أخر أغنيه",  "2017", R.drawable.cimage1, R.raw.caoghneya));
       bandsSongs.add(new BandSong("ليلي", "2017", R.drawable.cimage1, R.raw.calayla));
       bandsSongs.add(new BandSong("مربوط بأستك",  "2015", R.drawable.cimage1, R.raw.camarboot));
       bandsSongs.add(new BandSong("أفرد جناحك",  "2011", R.drawable.cimage1, R.raw.coefred));
       bandsSongs.add(new BandSong("وانا قاعد مع نفسي",  "2018", R.drawable.cimage1, R.raw.cawanaa));;
       bandsSongs.add(new BandSong("الكيف",  "2017", R.drawable.cimage1, R.raw.caelkeef));
       bandsSongs.add(new BandSong("نقطة بيضا",  "2017", R.drawable.cimage1, R.raw.canokta));
       bandsSongs.add(new BandSong("السكه شمال في شمال",  "2017", R.drawable.cimage1, R.raw.cashemalfeshemal));
       bandsSongs.add(new BandSong("اضحك",  "2017", R.drawable.cimage1, R.raw.caedhak));
       bandsSongs.add(new BandSong("لو كان عندي", "2018", R.drawable.cimage1, R.raw.colawkan));
       bandsSongs.add(new BandSong("مكملين", "2013", R.drawable.cimage1,R.raw.camkmleen));
       bandsSongs.add(new BandSong("غريب في بلاد غريبه",  "2014", R.drawable.cimage1, R.raw.cagaebfebelad));
       bandsSongs.add(new BandSong("اجمل ما عندي",  "2014", R.drawable.cimage1, R.raw.caagmalmaandy));

       //set the BandSongAdapter with listView ID and the arrayList.
       BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
       ListView listView = (ListView)findViewById(R.id.song);
       listView.setAdapter(songAdapter);

       listView.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               BandSong play = bandsSongs.get(position);
               Intent autost = new Intent(CairokyBandActivity.this, ListenToSong.class);
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
               mlisten = MediaPlayer.create(CairokyBandActivity.this, play.getmListenSong());
               mlisten.start();

           }
       });

       // set back button
       ImageButton goBack = (ImageButton) findViewById(R.id.playerList);
       goBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent goBack = new Intent(CairokyBandActivity.this, SecondActivity.class);

               startActivity(goBack);
           }
       });
   }

}