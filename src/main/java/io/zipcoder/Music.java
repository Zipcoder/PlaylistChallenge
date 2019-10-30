package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public int MoveForward(int currentPosition)
    {
        int nextPosition = 0;
        if (currentPosition != playList.length-1)
        {
            nextPosition = currentPosition+1;
        }
        else nextPosition = 0;

        return nextPosition;

    }

    public int MoveBackward(int currentPosition)
    {
        int nextPosition = 0;
        if (currentPosition != 0)
        {
            nextPosition = currentPosition-1;
        }
        else nextPosition = playList.length-1;

        return nextPosition;
    }

    public Integer selection(Integer startIndex, String selection)
    {
        Integer noClickForward = 0;
        Integer noClickBackward = 0;
        //forward
        int currentIndex = startIndex;
        int nextIndex = MoveForward(currentIndex);
        for (int i=0; i<playList.length ; i++)
        {
            if (playList[nextIndex].equalsIgnoreCase(selection))
            {
                i=playList.length;

            }
            else
            {
                currentIndex++;
                nextIndex = MoveForward(currentIndex);

            }
            noClickForward++;
        }

        currentIndex = startIndex;
        nextIndex = MoveBackward(currentIndex);
        for (int i=0; i<playList.length ; i++)
        {
            if (playList[nextIndex].equalsIgnoreCase(selection))
            {
                i=playList.length;

            }
            else
            {
                currentIndex++;
                nextIndex = MoveBackward(currentIndex);

            }
            noClickBackward++;
        }

        if (noClickForward>noClickBackward)
        {
            return noClickBackward;
        }
        else {
            return noClickForward;
        }

    }
}
