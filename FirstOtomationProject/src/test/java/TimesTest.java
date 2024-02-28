import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimesTest {

    //all tests for the given times
    @Test
    public void testTime1() throws ParseException {
        String time1 = "12:00:00.353";
        String pattern = "HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time1);
        Assert.assertNotNull(date);
    }

    @Test
    public void testTime2() throws ParseException {
        String time2 = "12:00:00.353+0300";
        String pattern = "HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time2);
        Assert.assertNotNull(date);
    }

    @Test
    public void testTime3() throws ParseException {
        String time3 = "12:00:00";
        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time3);
        Assert.assertNotNull(date);
    }

    @Test
    public void testTime4() throws ParseException {
        String time4 = "15:00:00.5";
        String pattern = "HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time4);
        Assert.assertNotNull(date);
    }
}
