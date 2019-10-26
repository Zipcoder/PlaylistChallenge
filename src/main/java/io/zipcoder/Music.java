package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counterForward = 0;
        int counterBackward = 0;
        for (int i = 0; i <= startIndex; i++) {
            counterForward++;
        }
            for (int j = 0; j < playList.length; j++) {
                counterBackward++;
            }
            if(counterForward < counterBackward){
                return counterForward;
            }
            else{
                return counterBackward;

            }
        }
    }

