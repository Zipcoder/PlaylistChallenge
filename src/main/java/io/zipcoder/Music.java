package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int forwardCount = 0;
        int backwardCount = 0;
        for (int currentIndex = 0; currentIndex <= startIndex ; currentIndex++) {
            forwardCount++;
            if (playList[currentIndex].equals(selection)) {
                break;
            }
        }
        for (int currentIndex = startIndex; currentIndex < playList.length; currentIndex++) {
            backwardCount++;
            if (playList[currentIndex].equals(selection)) {
                break;
            }
        }
        if (forwardCount > backwardCount) {
            return backwardCount;
        } else {
            return forwardCount;
        }
    }
}
