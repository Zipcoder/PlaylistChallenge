package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection))
                break;
            if (i + 1 > playList.length)
                i = -1;
                leftToRight++;
        }
        for (int i = startIndex; i < playList.length; i--) {
            if (playList[i].equals(selection))
                break;
            if (i - 1 < 0)
                i = playList.length;
                rightToLeft++;
            }

        if(leftToRight < rightToLeft) {
            return leftToRight;
        }
       return rightToLeft;
    }

}