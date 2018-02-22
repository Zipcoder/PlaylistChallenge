package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }
    public Integer selection(Integer startIndex, String selection) {
        return compareCounts(startIndex, selection);
    }

    public Integer moveBackwards(Integer startingIndex, String selection) {
        Integer count = 0;
        while (playList[startingIndex] != selection) {
            count++;
            if (startingIndex == 0) {
                startingIndex = playList.length - 1;
            } else {
                startingIndex--;
            }

        }

        return count;
    }

    public Integer moveForwards(Integer startingIndex, String selection) {
        Integer count = 0;
        while (playList[startingIndex] != selection) {
            count++;
            if (startingIndex == playList.length - 1) {
                startingIndex = 0;
            } else {
                startingIndex++;
            }

        }

        return count;
    }

    public Integer compareCounts(Integer startingIndex, String selection) {
        if (moveBackwards(startingIndex, selection) > moveForwards(startingIndex, selection)) {
            return moveForwards(startingIndex, selection);
        }
        return moveBackwards(startingIndex, selection);
    }
}
//    public Integer selection(Integer startIndex, String selection) {
//
//        int answer = 0;
//        for (int i = startIndex; i < playList.length; i++){
//           if    (playList[i%playList.length].equalsIgnoreCase(selection)){
//               answer += i%playList.length-1;
//           }
//            for (int j = startIndex; j>= playList.length; j--){
//               if (playList[j%playList.length].equalsIgnoreCase(selection)){
//                   answer += j%playList.length-1;
//               }
//            }
//        }
//
//        return answer;
//    }
//
//}

//begin: startIndex;
//locate all occurences of selection
//count distance between sI and selection(s)
//determine if distance is less than 1/2 the length of the playlist
// if less, then go in normal order
//if more than half length of playlist go via alt method
//  reverse/previous songs?
//        StringBuilder songLocationInPlayList = new StringBuilder();
//        //songLocationInPlayList.append(i);
//        int mySongSeen = 0;
//        int skipAhead =0;
//        int skipBack =0;
//        int answer = 0;
//        for (int i = 0; i < playList.length; i++) {
//            for (int j = playList.length-1; j > 0; j--) {
//                if (playList[j].equalsIgnoreCase(selection)) {
//                    skipBack += j;}
//                if (playList[i].equalsIgnoreCase(selection)) {
//                if(skipAhead += i;)
//                // skipAhead += i % playList.length;
//
//
//            }
//            if (skipAhead > skipBack)
//                answer = skipAhead;
//            if (skipAhead < skipBack)
//                answer = skipBack;
//        }
//
//        return answer;
//    }
//}