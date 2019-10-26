package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer upButton = pressUpButton(startIndex);
        Integer downButton = pressDownButton(startIndex);

        if (upButton < downButton){
            return upButton;
        }

        return downButton;
    }

    private Integer pressDownButton(Integer startIndex) {
        Integer secondCount = 0;
        for (int i = startIndex; i != playList.length - 1; i--){
            if (i == 0){
                i = playList.length;
                secondCount++;
            }else{
            secondCount++;
        }
        }
        return secondCount;
    }

    private Integer pressUpButton(Integer startIndex) {
        Integer count = 0;
        for (int i = startIndex; i < playList.length; i++){
            count++;
        }
        return count;
    }
}

