package io.zipcoder;

public class Music {

    private String[] playList;

    // constructor
    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counterA = 0;
        int counterB = 0;


        for(int i = 0; i <= startIndex; i++){
            counterA++;
        }
        for(int j = 0; j <= playList.length; j++){
            counterB++;
        }
        if(counterA > counterB){
            // return the less skip song options
            return counterB;
        }
        else{
            return counterA;
        }


    }
}
