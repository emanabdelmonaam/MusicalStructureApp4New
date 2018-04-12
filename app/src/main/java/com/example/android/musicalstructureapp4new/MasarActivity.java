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

public class MasarActivity extends AppCompatActivity {

   MediaPlayer mlisten;
   int currentPosition;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.song_list);

       // Create an ArrayList of AndroidFlavor objects
       final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
       bandsSongs.add(new BandSong("صباحك ضحكه", "2015", R.drawable.masar2,R.raw.masashezofro));
       bandsSongs.add(new BandSong("كانت هاتفرق",  "2012", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("زيك أنا", "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("قلبك ده عنواني",  "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("تقع وتقوم",  "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("وانا عطشان",  "2011", R.drawable.masar2, R.raw.masashezofro));;
       bandsSongs.add(new BandSong("أوقات",  "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("لسه الدنيا",  "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("بتقولي",  "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("يا عم",  "2014", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("متخفش من بكره", "2012", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("الليل",  "2013", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("بقيت غاوي", "2015", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("اجباري المسار",  "2013", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("انا موجود",  "2013", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("شتا",  "2013", R.drawable.masar2, R.raw.masashezofro));
       bandsSongs.add(new BandSong("شيروفوبيا",  "2016", R.drawable.masar2, R.raw.masashezofro));

       //set the BandSongAdapter with listView ID and the arrayList.
       BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
       ListView listView = (ListView)findViewById(R.id.song);
       listView.setAdapter(songAdapter);

       listView.setOnItemClickListener(new OnItemClickListener() {

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               BandSong play = bandsSongs.get(position);
               Intent autost = new Intent(MasarActivity.this, ListenToSong.class);
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
               mlisten = MediaPlayer.create(MasarActivity.this, play.getmListenSong());
               mlisten.start();
           }
       });

       // set back button
       ImageButton goBack = (ImageButton) findViewById(R.id.playerList);
       goBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent goBack = new Intent(MasarActivity.this, SecondActivity.class);

               startActivity(goBack);
           }
       });
   }

}