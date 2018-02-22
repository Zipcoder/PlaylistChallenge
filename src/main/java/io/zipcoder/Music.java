package io.zipcoder;

public class Music {

    //An array of n strings, songs, where the value of each element si corresponds to the song at index i in the playlist (where 0 ≤ i < n).
    // An integer, k, the index of song sk. A string, q, the name of the song you wish to switch to.
    // It must return an integer denoting the minimum number of button presses needed to switch from song sk to song q.

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        //find the index of selection CLOSEST to the startIndex
        int selectionIndex = 0;
        for (int i = 0; i < playList.length; i++) {

            if (playList[i].equals(selection) && (playList.length-i < startIndex+ i)) {
                selectionIndex += i;
            }
        }
        //if the startIndex comes BEFORE the selection index
        //ed- [startIndex....,... selectionIndex..]
        if (selectionIndex > startIndex) {
            //(left side count VS right side count)
            if (selectionIndex - startIndex < (startIndex + playList.length - selectionIndex)) {
                return selectionIndex - startIndex;
            }
            return startIndex + playList.length - selectionIndex;
        }
        //if the startIndex comes AFTER the selection index
        //ed- [selectionIndex....,... startIndex..]
        if (selectionIndex < startIndex) {
            //(left side count VS right side count)
            if (startIndex - selectionIndex < (selectionIndex + playList.length - startIndex)) {
                return  selectionIndex  + playList.length - startIndex;
            }
            return startIndex- selectionIndex;

        }
        return null;
    }
}
