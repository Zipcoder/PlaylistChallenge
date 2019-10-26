package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }



    public Integer selection(Integer startIndex, String selection) {



        int leftCount=0;
        int rightCount=0;
        //right counting
        int i=startIndex;
        while(playList[i]!=selection){
            i++;
            rightCount++;
            if(i==playList.length){
                i=0;
            }

        }
        //left counting
        int j=startIndex;
        while(playList[j]!=selection){
            j--;
            leftCount++;

            if(j<0){
                j=playList.length-1;
            }

        }
        if(leftCount<=rightCount){
            return leftCount;
        }




        return rightCount;
    }
}