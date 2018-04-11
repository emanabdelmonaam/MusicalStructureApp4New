package com.example.android.musicalstructureapp4new;

/**
 * Created by user on 29/03/2018.
 */

public class BandSong {
    /** we have add three private variable in this class.
     * and we put  m before each variable name.
     * the song name */
    private String mSongName;

    /** the song Year*/
    private String mIconYear;

    /** the play Icon*/
    private int mIconPlay;

    /** the play song*/
    private int mListenSong;

    /** then we add the conestractur also this conestractor name is the same name of our class
     * and has three variable name*/
    public  BandSong(String vSongName, String vIconYear, int vIconPlay, int vListenSong){
        //inset this variable there are two stats
        mSongName = vSongName;
        mIconYear =vIconYear;
        mIconPlay =vIconPlay;
        mListenSong =vListenSong;

    }

     // get Song Name method of the word.
    public String getSongName(){
        return mSongName;
    }

     // get Icon Play method of the word.
    public String getIconYear(){
        return mIconYear;
    }

     //get the Icon Stop method of the word.
    public int getmIconPlay(){
        return mIconPlay;
    }

    //get the Song method of the word.
    public int getmListenSong(){
        return mListenSong;
    }

}