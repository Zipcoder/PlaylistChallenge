package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int count = 0;
        for (int i = startIndex; !playList[i].equals(selection); i++) {
            if(i == playList.length - 1) {
                i = -1;
            }
            count++;
        }

        int revCount = 0;
        for (int i = startIndex; !playList[i].equals(selection); i--) {
            if(i == 0) {
                i = playList.length;
            }
            revCount++;
        }

        if(count < revCount) { return count; }
        else { return revCount; }
    }
}
