package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clickUp = 0;
        int clickDown = 0;

        //move forward through the array
        for(int i = startIndex ; i <= playList.length; i++){

            if(playList[i].equals(selection)){
                break;
            }
            clickUp++;
            /*if we get to the end of the playlist and don't find our song, we'll have to
                start at the other end and keep on counting, bewaring of an infinite loop
             */
            if (i == (playList.length - 1)) {
                i = -1;
            }
        }

        //move backwards through the array
        for(int j = startIndex; j >= 0 ; j--){

            if(playList[j].equals(selection)){
                break;
            }
            clickDown++;
            if (j == 0) {
                j = playList.length;
            }
        }

        //return whichever counter is smaller
        //Math.min was auto-suggested from an if statement
        //it will return the smaller number
        return Math.min(clickUp, clickDown);
    }
}
