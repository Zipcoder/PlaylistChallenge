package io.zipcoder;

import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        Integer[] occurrenceIndex = selectionOccurrences(selection);
        int lowestPushesPressDown = pressDown(startIndex, occurrenceIndex);
        int lowestPushesPressUp = pressUp(startIndex, occurrenceIndex);

        if (lowestPushesPressUp <= lowestPushesPressDown) {
            return lowestPushesPressUp;
        } else return lowestPushesPressDown;
    }


    public Integer[] selectionOccurrences(String selection) {
        Integer[] occurrenceIndex;
        StringBuilder sb = new StringBuilder();

        for (int i =0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                sb.append(i + " ";
            }
        }
        return occurrenceIndex;

    }

    public int pressUp (Integer startIndex, Integer[] occurrenceIndex) {
        int lowestPushes = 0;
        for (int i = 0; i <occurrenceIndex.length; i ++ ) {
            if (occurrenceIndex[i] > startIndex) {
                if (lowestPushes <= (occurrenceIndex[i] - startIndex)) {
                    lowestPushes = (occurrenceIndex[i] - startIndex);
                }
            }
            if (occurrenceIndex[i] < startIndex) {
                if ((Math.abs(0 - occurrenceIndex[i])) + (playList.length - startIndex) < lowestPushes) {
                    lowestPushes = occurrenceIndex[i] - startIndex;
                }
            }
        }
        return lowestPushes;
    }
    public int pressDown (Integer startIndex, Integer[] occurrenceIndex) {
        int lowestPushes = 0;
        for (int i = 0; i <occurrenceIndex.length; i ++ ) {
            if (occurrenceIndex[i] > startIndex) {
                if (lowestPushes <= (occurrenceIndex[i] - startIndex)) {
                    lowestPushes = (occurrenceIndex[i] - startIndex);
                }
            }
            if (occurrenceIndex[i] < startIndex) {
                if ((Math.abs(0 - occurrenceIndex[i])) + (playList.length - startIndex) < lowestPushes) {
                    lowestPushes = occurrenceIndex[i] - startIndex;
                }
            }
        }
        return lowestPushes;
    }
}
