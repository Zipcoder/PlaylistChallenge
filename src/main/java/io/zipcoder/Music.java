package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

//    String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
//    Music music = new Music(playlist);
//    Integer startingIndex = 0;
//    String selection = "liveoak";
//    Integer expected = 1;
//    Integer actual = music.selection(startingIndex, selection);
//        Assert.assertEquals(expected, actual);

//    def distance(len_my_list, idx_1, idx_2):
//    dist = abs(idx_1 - idx_2)
//    return min(len_my_list - dist, dist)
    public Integer selection(Integer startIndex, String selection) {
        int current = 0;


        for (int i = 0; i < playList.length; i++) {
            if (playList[i].equals(selection)) {
                 current = Math.abs(startIndex - i);

            }
        }


        return Integer.min(playList.length - current, current);
    }
}
