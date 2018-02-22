package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int lengthOfList = playList.length;
        int goForward = 0;
        int goBack = 0;
        int Index = 0;
        for (int i = 0; i < playList.length; i++) {
            if (selection == playList[i]) {
                Index = i;

                if (Index > startIndex) {
                    goForward = Index - startIndex;
                    if (Index < lengthOfList-1) {
                        goBack = lengthOfList-1 - Index;
                    }
                }
            }
                }
            if (goForward > goBack) {
                return goBack;
            }else return goForward;
        }
    }





