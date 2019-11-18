package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        Integer minDist = playList.length;
        for(int i = 0; i < playList.length; i++){
            if(selection.equals(playList[i])){
                if(Math.abs(startIndex - i) < minDist){
                    minDist = Math.abs(startIndex - i);
                }
                if((playList.length - Math.abs(startIndex - i)) < minDist){
                    minDist = playList.length - Math.abs(startIndex - i);
                }

            }
        }
        if(minDist == playList.length){   // song is not in playList
            return -1;
        }


        return minDist;
    }
}
