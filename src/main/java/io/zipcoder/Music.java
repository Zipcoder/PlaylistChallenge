package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }
    public Integer buttonForwardPresses = 0;
    public Integer buttonBackPresses = 0;


    public Integer selection(Integer startIndex, String selection){
        int i = startIndex.intValue();
        int j = startIndex.intValue();
        int lastSong = playList.length - 1;
        int firstSong = 0;
//        for(i = startIndex, j = startIndex; i <= playList.length; i++)  {
        while(!playList[i].equals(selection) && !playList[j].equals(selection))    {
            buttonBackPresses++;
            buttonForwardPresses++;
            if(i == lastSong) {
                i = firstSong;
            }   if(j == firstSong) {
                j = lastSong;
            }   i++;
            j--;
        }
        return buttonForwardPresses < buttonBackPresses ? buttonForwardPresses : buttonBackPresses;
    }
}
