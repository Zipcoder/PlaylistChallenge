package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {


        int indexOfSelection = 0;

        for (int i = 0; i < playList.length; i++) {

            if (playList[i].equals(selection) && (playList.length - i < startIndex + i)) {
                indexOfSelection += i;
            }
        }

        //if startIndex is BEFORE the indexSelection
        // [startIndex           selectionIndex]

        if (indexOfSelection > startIndex) {

            //(left side count VS right side count)
            if (indexOfSelection - startIndex < (startIndex + playList.length - indexOfSelection)) {
                return indexOfSelection - startIndex;
            }
            return startIndex + playList.length - indexOfSelection;
        }

        //if startIndex is AFTER the indexSelection
        // [selectionIndex        startIndex]
        if (indexOfSelection < startIndex) {

            //(left side count VS right side count)
            if (startIndex - indexOfSelection < (indexOfSelection + playList.length - startIndex)) {
                return indexOfSelection + playList.length - startIndex;
            }
            return startIndex - indexOfSelection;
        }
        return null;
    }
}