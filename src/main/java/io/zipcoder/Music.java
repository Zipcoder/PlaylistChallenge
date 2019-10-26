package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int counterCurrentLocation = 0;
        int counterUpArrow = 0;
        int counterDownArrow = 0;
        int counterNumberSteps = 0;

        // up arrow direction
        counterCurrentLocation = playList.length - 1;
        if (startIndex != playList.length - 1) counterCurrentLocation = startIndex + 1;
        counterUpArrow ++;


        while (counterCurrentLocation != startIndex){
            if (selection.equals(playList[counterCurrentLocation])) {
                break;
            }
            // if we hit the end of the loop, reset and start from beginning of the list
            if (counterCurrentLocation >= playList.length - 1){
                counterCurrentLocation = 0;
            }
            counterCurrentLocation ++;
            counterUpArrow ++;
        }



        // down arrow direction
        counterCurrentLocation = 0;
        if (startIndex != 0) counterCurrentLocation = startIndex - 1;
        counterDownArrow ++;
        counterNumberSteps = counterUpArrow;

        while (counterCurrentLocation != startIndex){
            if (selection.equals(playList[counterCurrentLocation])) {
                break;
            }
            // if we hit the end of the loop, reset and start from beginning of the list
            if (counterCurrentLocation <= 0){
                counterCurrentLocation = playList.length;
            }
            counterCurrentLocation --;
            counterDownArrow ++;
        }

        if (counterDownArrow < counterUpArrow) counterNumberSteps = counterDownArrow;

        return counterNumberSteps;
    }
}
