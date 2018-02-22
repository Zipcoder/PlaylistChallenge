package io.zipcoder;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {


        return compareCounts(startIndex, selection);
    }

    public Integer moveBackwards(Integer startingIndex, String selection) {
        Integer count = 0;
        while (playList[startingIndex] != selection) {
            count++;
            if (startingIndex == 0) {
                startingIndex = playList.length - 1;
            } else {
                startingIndex--;
            }

        }

        return count;
    }

    public Integer moveForwards(Integer startingIndex, String selection) {
        Integer count = 0;
        while (playList[startingIndex] != selection) {
            count++;
            if (startingIndex == playList.length - 1) {
                startingIndex = 0;
            } else {
                startingIndex++;
            }

        }

        return count;
    }

    public Integer compareCounts(Integer startingIndex, String selection) {
        if (moveBackwards(startingIndex, selection) > moveForwards(startingIndex, selection)) {
            return moveForwards(startingIndex, selection);
        }
        return moveBackwards(startingIndex, selection);
    }


}



