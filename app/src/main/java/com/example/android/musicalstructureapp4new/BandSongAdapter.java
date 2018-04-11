package com.example.android.musicalstructureapp4new;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by user on 29/03/2018.
 */

public class BandSongAdapter extends ArrayAdapter<BandSong> {

    //  private static final String LOG_TAG = BandSongAdapter.class.getSimpleName();

    public BandSongAdapter(Activity context, ArrayList<BandSong> bandSongs) {

        super(context, 0, bandSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listSongName = convertView;
        if(listSongName == null) {
            listSongName = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link BandSong} object located at this position in the list
        BandSong currentBandSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listSongName.findViewById(R.id.song_name);

        // set this text on the name TextView
        nameTextView.setText(currentBandSong.getSongName());

        // Find the year in the list_item.xml layout with the ID list_item_icon
        TextView iconYear = (TextView) listSongName.findViewById(R.id.song_year);

        // set the year to iconView
        iconYear.setText(currentBandSong.getIconYear());

        // Find the song in the list_item.xml layout with the ID list_item_icon
        ImageView iconPlay = (ImageView) listSongName.findViewById(R.id.icon_play);

        // set the song to iconView
        iconPlay.setImageResource(currentBandSong.getmIconPlay());

        /** Return the whole list item layout
         * so that it can be shown in the ListView
         */
        return listSongName;

    }

}