package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList)
    {this.playList = playList;}

    public Integer selection(Integer startIndex, String selection)
    {
        //Use an ArrayList
        List<String> songList = Arrays.asList(this.playList);

        /*The formula for forward takes the index of the selection
         and minus the startIndex then Math.abs*/
        int indexOfSelection = songList.indexOf(selection);
        int indexDifference = indexOfSelection - startIndex;
        int forwardClicks = Math.abs(indexDifference);

        /*The formula for backwardClicks adds the size of the array plus the startIndex
         * and subtracts the last index of the array. In essance it finds the distance without
         * physically looping backwards */
        int listSize = songList.size();
        int sizePlusStart = listSize + startIndex;
        int lastIndexOfSelection = songList.lastIndexOf(selection);
        int backwardClicks = Math.abs(sizePlusStart) - lastIndexOfSelection;


        //then compares the two values for backwardClicks and forwardClicks and returns the minimum
        return Math.min(forwardClicks, backwardClicks);

    }}

////    public Integer selectionn(Integer startIndex, String selection)
////    {
////        //Use an ArrayList
////        ArrayList<String> songList = new ArrayList<String>(Arrays.asList(this.playList));
////
////        /*The formula for forward takes the index of the selection
////         and minus the startIndex then Math.abs*/
////
////        int forwardClicks = Math.abs(songList.indexOf(selection) - startIndex);
////
////        /*The formula for backwardClicks adds the size of the array plus the startIndex
////         * and subtracts the last index of the array. In essance it finds the distance without
////         * physically looping backwards */
////
////        int backwardClicks = Math.abs(songList.size() + startIndex) - (songList.lastIndexOf(selection));
////
////
////        //then compares the two values for backwardClicks and forwardClicks and returns the minimum
////
////        return Math.min(forwardClicks, backwardClicks);
////
////    }
//}
