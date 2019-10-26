package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int numberOfClicks = 0;
        for (int currentIndex = startIndex; currentIndex < playList.length; currentIndex++) {
            String currentSong = playList[currentIndex];
            if(currentSong.equals(selection)){
                break;
            }
            numberOfClicks++;

        }
        return numberOfClicks;
    }
}
