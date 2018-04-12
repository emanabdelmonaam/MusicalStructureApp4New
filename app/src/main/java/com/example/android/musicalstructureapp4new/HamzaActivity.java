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

public class HamzaActivity extends AppCompatActivity {

   MediaPlayer mlisten;
   int currentPosition;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.song_list);

       // Create an ArrayList of AndroidFlavor objects
       final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
       bandsSongs.add(new BandSong("داري يا قلبي", " 2018", R.drawable.hamza2, R.raw.hamzadary));
       bandsSongs.add(new BandSong("يا مظلوم",  " 2014", R.drawable.hamza2, R.raw.hamzyamazloum));
       bandsSongs.add(new BandSong("إنسان",  " 2011", R.drawable.hamza2, R.raw.hamzinsan));
       bandsSongs.add(new BandSong("يا هنا",  " 2011", R.drawable.hamza2, R.raw.hamzyhanah));
       bandsSongs.add(new BandSong("بص بص",  " 2018", R.drawable.hamza2, R.raw.hamzabsbs));;
       bandsSongs.add(new BandSong("صباح الخير ",  " 2011", R.drawable.hamza2, R.raw.hamzsabah));
       bandsSongs.add(new BandSong("دوري",  " 2012", R.drawable.hamza2, R.raw.hamzdoury));
       bandsSongs.add(new BandSong("تذكرتك رايح جاي", " 2012", R.drawable.hamza2, R.raw.hamztazkarty));
       bandsSongs.add(new BandSong("اسمعني",  " 2011", R.drawable.hamza2, R.raw.hamzadary));
       bandsSongs.add(new BandSong("الواد العبيط", " 2015", R.drawable.hamza2, R.raw.hamzelwadelabeet));
       bandsSongs.add(new BandSong("ولا صحبه احلي",  " 2018", R.drawable.hamza2, R.raw.nzawalasohba));
       bandsSongs.add(new BandSong("مالك",  " 2017", R.drawable.hamza2, R.raw.hamzmalk));
       bandsSongs.add(new BandSong("وأقولك ايه",  " 2014", R.drawable.hamza2, R.raw.hamzadary));

       //set the BandSongAdapter with listView ID and the arrayList.
       BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
       ListView listView = (ListView)findViewById(R.id.song);
       listView.setAdapter(songAdapter);

       listView.setOnItemClickListener(new OnItemClickListener() {

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               BandSong play = bandsSongs.get(position);
               Intent autost = new Intent(HamzaActivity.this, ListenToSong.class);
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
               mlisten = MediaPlayer.create(HamzaActivity.this, play.getmListenSong());
               mlisten.start();
           }
       });

       // set back button
       ImageButton goBack = (ImageButton) findViewById(R.id.playerList);
       goBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent goBack = new Intent(HamzaActivity.this, SecondActivity.class);

               startActivity(goBack);
           }
       });
   }

}