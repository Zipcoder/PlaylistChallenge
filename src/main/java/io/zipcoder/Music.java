package io.zipcoder;

public class Music {

    private String[] playList;


    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        Integer countForward = 0;
        for (int x = startIndex; x < playList.length; x++) {
            if (playList[x].equals(selection)) {
                countForward = x - startIndex;
            } else if (!playList[x].equals(selection)) {
                countForward++;
            }
        }
            if ((!playList[playList.length -1].equals(selection)) &&  (countForward == ((playList.length -1)- (startIndex)))) {
                for (int i = 0; i < playList.length; i++) {
                    if (playList[i].equals(selection)) {
                        countForward = countForward + i;
                    }
                }
            }

        Integer countBack = 0;
        for (int x = startIndex; x >= 0; x--) {
            if (playList[x].equals(selection)) {
                countBack = startIndex - x;
            } else if (!playList[x].equals(selection)) {
                countBack++;
            }
        }
        if ((!playList[0].equals(selection)) &&  (countBack == (startIndex))) {
            for (int i = playList.length -1; i >= 0; i--) {
                if (playList[i].equals(selection)) {
                    countBack = countBack + ((playList.length -1) - i);
                }
            }
        }

        if (countBack > countForward) {
            return countForward;
        } else if (countBack < countForward) {
            return countBack;

        } else if (countBack.equals(countForward)) {
            return countForward;
        }
        return 0;
    }



    }

