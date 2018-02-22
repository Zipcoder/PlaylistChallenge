package io.zipcoder;

import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        return pressCounts(startIndex, selection);
      }

    public Integer pressCounts (Integer startIndex, String selection) {
        int pressNext = pressForwards(startIndex, selection);
        int pressPrevious = pressBackwards(startIndex ,selection);
        if (pressNext > pressPrevious) {
            return pressPrevious;
        }
        return pressNext;
    }

    public Integer pressForwards(Integer startIndex, String selection) {
        int skipCount = 0;
        int length = playList.length -1;
        while (!playList[startIndex].equals(selection)) {
            skipCount ++;
            if (startIndex ==0) {
                startIndex = length;
            } else {
                startIndex --;
            }
        } return skipCount;
    }


    public int pressBackwards (Integer startIndex, String selection) {
        int skipCount = 0;
        int length = playList.length -1;
        while (!playList[startIndex].equals(selection)) {
            skipCount ++;
            if (startIndex ==length) {
                startIndex = 0;
            } else {
                startIndex ++;
            }
        } return skipCount;
    }
}
