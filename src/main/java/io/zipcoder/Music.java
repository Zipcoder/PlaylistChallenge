package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int forward = forwardPlaylistCount(startIndex, selection);
        int backward = backwardPlaylistCount(startIndex, selection);
                //playList.length-forwardPlaylistCount(startIndex, selection);

        if(startIndex.equals(selection)){
            return 0;
        }
        else if(forward < backward){
            return forward;
        }
        else if(forward > backward){
            return backward;
        }
        else {
            return forward;
        }

    }




    public int forwardPlaylistCount(Integer startIndex, String selection){

        String[] backOfArray = Arrays.copyOfRange(playList, startIndex, playList.length);
        String[] frontOfArray = Arrays.copyOfRange(playList, 0, startIndex);
        List<String> listOfSongs = new ArrayList<String>();
        Collections.addAll(listOfSongs, backOfArray);
        Collections.addAll(listOfSongs,frontOfArray);




        int counter = 0;

        for(int i = 0; i < listOfSongs.size(); i++){

            if (listOfSongs.get(i).equals(selection)){
                return counter;
            }
            counter++;
            }

            return counter;
        }




    public int backwardPlaylistCount(Integer startIndex, String selection){
        int selectionIndex = 0;
        String songAtStartIndex=playList[startIndex];
        for(int i = 0; i < playList.length; i++){
            if(playList[i].equals(selection)) {
                selectionIndex = i;
            }

        }

        String[] backOfArray = Arrays.copyOfRange(playList, selectionIndex, playList.length);
        String[] frontOfArray = Arrays.copyOfRange(playList, 0, selectionIndex);
        List<String> listOfSongs = new ArrayList<String>();
        Collections.addAll(listOfSongs,backOfArray);
        Collections.addAll(listOfSongs,frontOfArray);

        int counter = 0;

        for(int i = 0; i < listOfSongs.size(); i++){

            if (listOfSongs.get(i).equals(songAtStartIndex)){
                return counter;
            }
            counter++;
        }

        return counter;
    }

}









