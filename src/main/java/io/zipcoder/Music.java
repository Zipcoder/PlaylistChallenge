package io.zipcoder;
//Michael Doll
//10.27.19
//Need to re evaluate
public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int shortest = 0;
        int count = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                shortest = count;
                break;
            }
            if (i == playList.length - 1 && selection.equals(playList[0])) {
                count++;
                shortest = count;
            }
            count++;
        }
            count = 0;
            for (int i = startIndex; i >=0; i--) {
                if (playList[i].equals(selection)) {
                    if (count < shortest) {
                        shortest = count;
                        break;
                    }
                }
                count++;
                if (i == 0 && selection.equals(playList[playList.length-1])) {
                   shortest = count;
                }
            }
        return shortest;
    }
}
