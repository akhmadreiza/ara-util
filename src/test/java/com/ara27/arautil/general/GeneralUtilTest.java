/*
package com.ara27.arautil.general;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.ara27.arautil.constants.DateFormatConstants.DEFAULT_DATE_FORMAT;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneralUtilTest {

    private GeneralUtil generalUtil = new GeneralUtil();
    private String defaultDateFormat = DEFAULT_DATE_FORMAT;

    @Test
    public void test_getUUID_isString() {
        assertEquals(String.class, generalUtil.getUUID().getClass());
    }

    @Test
    public void test_changeDateFormat() {
        String oldDateFormat = "22-04-2018 18:05:58";
        String expectedDateFormat = "22/04/18";
        assertEquals(expectedDateFormat, generalUtil.changeDateFormat(oldDateFormat));
    }

    @Test
    public void test_changeDateFormat_changeWithNewDateFormat() {
        DateTimeFormatter expectedDtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        DateTimeFormatter oldDtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmmss");
        LocalDateTime ldt = LocalDateTime.now();
        String oldDateFormat = oldDtf.format(ldt);
        String expectedDateFormat = expectedDtf.format(ldt);
        assertEquals(expectedDateFormat, generalUtil.changeDateFormat(oldDtf, expectedDtf, oldDateFormat));
    }

    @Test
    public void test_changeDateFormat_toDefaultDateFormat() {
        DateTimeFormatter oldDtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmmss");
        DateTimeFormatter expectedDtf = DateTimeFormatter.ofPattern(defaultDateFormat);
        LocalDateTime ldt = LocalDateTime.now();
        String oldDateFormat = oldDtf.format(ldt);
        String expectedDateFormat = expectedDtf.format(ldt);
        assertEquals(expectedDateFormat, generalUtil.changeDateFormat(oldDtf, oldDateFormat));
    }
}
*/
