package io.zipcoder;

public class Music {

    private String[] playList;


    //String[] n=songs | Integer k=index of the song | String q= the name of the song you wish to switch to
    //identify the Occurences
    //get the length going forward
    //get the length going backwards

    public Music(String[] playList){


        this.playList = playList;

    }

    public Integer selection(Integer startIndex, String selection){

        return compareForwardBackward(startIndex, selection);
    }






    //method to go forward
    public Integer forwardButton(Integer startingIndex, String selection){

        Integer counter = 0;

        for(Integer i = Integer.valueOf(playList[startingIndex]); i < playList.length; i++){
            counter++;
            if(playList.length-1 == startingIndex){
                startingIndex = 0;
            }else{
                startingIndex++;
            }
        }
        return counter;
    }




    //method to go backwards
    public Integer backwardsButton(Integer startingIndex, String selection){

        Integer counter = 0;

        for(Integer i = Integer.valueOf(playList[startingIndex]); i <playList.length; i++){

            counter++;
            if(startingIndex==0){
                startingIndex = playList.length-1;
            }else{
                startingIndex--;
            }
        }
        return counter;
    }

    public Integer compareForwardBackward(Integer startingIndex, String selection){

        if(forwardButton(startingIndex,selection) < backwardsButton(startingIndex,selection)){
            return forwardButton(startingIndex,selection);
        }
        return forwardButton(startingIndex, selection);
    }


}
