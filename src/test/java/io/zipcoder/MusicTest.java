package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

    @Test
    public void selectionTest1() {

        String[] playlist = {"wheniseeyouagain", "borntorun", "nothingelsematters", "cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2() {

        String[] playlist = {"dancinginthedark", "rio", "liveoak", "liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest3() {

        String[] playlist = {"heyjude", "inmylife", "letitbe", "ijustseenaface",
                "isawherstandingthere", "tickettoride", "help", "paperbackwriter", "harddaysnight"};
        Music music = new Music(playlist);
        Integer startingIndex = 2;
        String selection = "tickettoride";
        Integer expected = 3;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    //test to wrap around the bottom of the array
    @Test
    public void selectionTest4() {

        String[] playlist = {"bohemianrhapsody", "killerqueen", "fatbottomedgirls", "underpressure",
                "iwantobreakfree", "somebodytolove", "flashgordontheme", "crazylittlethingcalledlove", "wearethechampions"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "crazylittlethingcalledlove";
        Integer expected = 3;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }


    //test to wrap around the top of the array
    @Test
    public void selectionTest5() {
        String[] playlist = {"tinydancer", "downtletthesungodownonme", "yoursong", "saturday",
                "bennyandthejets", "crocodilerock"};
        Music music = new Music(playlist);
        Integer startingIndex = 5;
        String selection = "tinydancer";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
}

