package ru.javaxblog.time;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aleksey on 15.01.2016.
 */


public class TimeTest {

    @Test
    public void testMain() {
        String dt=new java.text.SimpleDateFormat(("hh:mm aaa")).format(java.util.Calendar.getInstance().getTime());
        Assert.assertNotNull(dt);
    }



}