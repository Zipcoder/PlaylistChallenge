package io.zipcoder;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Music {
    //  you need an action button, that skips forward (down) > and goes back (up) < to previous song
//  find the number of button presses to get from song "sk" - "q" ?
//  the same song can appear multiple times in the playlist
//
//       3   Playlist parameters
//---------------------------------------
//  1.)An array of 'n' strings = songs, 'si' elements correspond to the song[i] in the playlist (0 <= i < n)
//  2.)An int 'k' = the index of song 'sk'
//  3.)A string 'q' = name of the song I want to switch to
//  *** My input must return an output of integer with the minimum number of "skips" to get from song 'sk' to song 'q'***
//
//  Constraints:
//---------------------------------------
//  1 <= n <= 100
//  0 <= k<= n - 1
//  1 <= length of 'si' <= 100
//
    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        return null;
    }

    public Integer skipBack(Integer startingIndex, String selection) {
        Integer counter = 0;
        while (playList[startingIndex] != selection) {
            if (startingIndex == playList.length - 1) {
                startingIndex = 0;
            } else {
                startingIndex--;
            }
            return counter;
        }
        return null;
    }

    public Integer skipTrack(Integer startingIndex, String selection) {
        Integer counter = 0;
        while (playList[startingIndex] != selection) {
            if (startingIndex == playList.length - 1) {
                startingIndex = 0;
            } else {
                startingIndex++;
            }
            return counter;
        }
        return null;
    }
}