package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;
import sun.rmi.server.InactiveGroupException;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public void testMoveForwards() {
        String[] playlist = {"wheniseeyouagain", "borntorun", "nothingelsematters", "cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 3;
        Integer expected = 1;
        Integer actual = music.moveForwards(startingIndex, "wheniseeyouagain");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMoveBackwards() {
        String[] playlist = {"wheniseeyouagain", "borntorun", "nothingelsematters", "cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        Integer expected = 3;
        Integer actual = music.moveBackwards(startingIndex, "borntorun");
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
}
