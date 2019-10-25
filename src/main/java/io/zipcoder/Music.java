package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int distance = 0;
        int selectionIndex = 0;

        for (int i = startIndex; i < playList.length+1; i++) {
            distance++;
            if (i >= playList.length) {
                i = 0;
            }
            if (playList[i].equals(selection)) {
                selectionIndex = i;
            }
            if (distance >= playList.length) break;
        }

        int dist1 = Math.abs(selectionIndex - startIndex);
        int dist2 = startIndex + playList.length - selectionIndex;
        distance = Math.min(dist1, dist2);
        return distance;
    }
}
