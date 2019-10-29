package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        String[] upButton = new String[playList.length];
        String[] downButton = new String[playList.length];


        // build downButton array

        int w = 0;
        for (int i = startIndex; i < playList.length; i++){
            downButton[w] = playList[i];
            w++;
        }

        //int w = playList.length - startIndex;

        for (int i = 0; w < playList.length; i++) {
            downButton[w] = playList[i];
            w++;
        }



        // build upButton array

        int x = 0;
        for (int j = startIndex; j >= 0; j--){
            upButton[x] = playList[j];
            x++;
        }

        for(int j = playList.length -1; j > startIndex; j--){
            upButton[x] = playList[j];
            x++;
        }

        //print arrays
        /*
        System.out.println(Arrays.toString(upButton));
        System.out.println(Arrays.toString(downButton));
        */

        //test which index is lower

        int ans;

        if(Arrays.asList(downButton).indexOf(selection) <= Arrays.asList(upButton).indexOf(selection)){
            ans = Arrays.asList(downButton).indexOf(selection);
        }   else {
            ans = Arrays.asList(upButton).indexOf(selection);
        }

        return ans;
    }
}
