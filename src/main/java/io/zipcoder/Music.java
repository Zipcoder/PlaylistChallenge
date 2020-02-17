package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        Integer search = 0;
        Integer upCount;
        Integer downCount;
        Integer endOfArray = playList.length;

        if (startIndex == endOfArray) {upCount = 0;}
            else {upCount = startIndex +1;}
        if (startIndex == 0) {downCount = endOfArray - 1;}
            else {downCount = startIndex -1;}


        if (playList[startIndex] == selection) {
            //return search;
        } else {search = 1;
            while (playList[upCount] != selection && playList[downCount] != selection) {
                //search++;
                if (upCount == endOfArray - 1) {upCount = 0;} else {upCount++;}
                if (downCount == 0) {downCount = endOfArray - 1;} else {downCount--;}
                search++;
            }
        }

        return search;

    }
}