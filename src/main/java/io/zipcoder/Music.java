package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int counter1 = 0;
        int counter2 = 1;
        int result = 0;

        for (int x = startIndex; x < playList.length; x++){

            if (playList[x].equals(selection) ){
               break;
            }

            counter1++;
        }

        result = counter1;

        if(startIndex == 0){

            for (int x = playList.length - 1; x > 0; x--){

             if (playList[x].equals(selection) ){
                    break;
                }

             counter2++;

             }

              if(counter1 > counter2){
                  result = counter2;
              }else{
                  result = counter1;
              }
        }




        return result;
    }
}
