package io.zipcoder;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.Math;
import java.lang.reflect.Array;


public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {



        int fwdCount = 0;
        int bwdCount = 0;

        int newSongIndex = ArrayUtils.indexOf(playList, selection);

        if (newSongIndex > startIndex)
        {

        }


        for (int i = startIndex; i < playList.length; i++) {

            if (playList[i].equals(selection))
                {break;}

            fwdCount++;

            if(i == (playList.length-1))
            {
                i = -1;   //because we have to include another click to go from the end to the beginning
            }
        }

        for (int j = startIndex; j >= 0; j--) {
            if (playList[j].equals(selection)) {
                break;}
             bwdCount++;
             if (j == 0) {
                j = playList.length;  //because we have to do another click from the beginning back to the end.
            }

        }

        if (bwdCount < fwdCount) {
            return bwdCount;
        } else {
            return fwdCount;
        }
    }
}

//            for (int j = startIndex; j < startIndex + playList.length - 1; j--) {
//                if (!playList[playList.length + i % playList.length].equals(selection)) {
//                    bwdCount++;
//                    break;


//
//        int newSongIndex = ArrayUtils.indexOf(playList, selection);
//        int check = checkPlaylist(playList, startIndex, newSongIndex);
//
//        int newSongIndex2 = checkForDuplicateIndex(playList,  selection);
//        //int newSongIndex2 = ArrayUtils.indexOf(playList, selection, newSongIndex);
//        int check2 = checkPlaylist(playList, startIndex, newSongIndex2);
//        int result = shorterClicks(check, check2);
//
//
//        return result;
//    }
//
//    public int checkPlaylist (String[] playList, Integer startIndex, int newSongIndex)
//    {
//
//        int clicksFwd=0;
//        int clicksBwd=0;
//        int loopsAround=0;
//        if (newSongIndex > startIndex)
//        {
//            clicksFwd = newSongIndex - startIndex;
//            loopsAround = (startIndex) + ((playList.length) - newSongIndex+1);
//
//            if (clicksFwd < loopsAround)
//            {return clicksFwd;}
//            else if (loopsAround < clicksFwd)
//            {return loopsAround;}
//
//        }
//        else if (newSongIndex < startIndex)
//        {
//            clicksBwd = startIndex - newSongIndex;
//            loopsAround= (newSongIndex) + ((playList.length)-startIndex);
//            if (clicksBwd < loopsAround)
//            {return clicksBwd;}
//            else if (loopsAround < clicksBwd)
//            {return loopsAround;}
//        }
//        return 0;
//    }
//    public int  checkForDuplicateIndex (String[] playList, String selection)
//    {
//        int newSongIndex2=0;
//
//            for (int i=playList.length-1; i>= 0; i--)
//                {
//
//                    if(playList[i].equals(selection))
//                    {
//                        newSongIndex2 = i;
//
//                        return newSongIndex2;
//
//                    }
//                }
//
//
//        return newSongIndex2;
//    }
//
//    public int shorterClicks (int check, int check2)
//    {
//        if (check < check2)
//        {
//            return check;
//        }
//        else if (check2 < check)
//        {
//            return check2;
//        }
//        return check;
//    }





