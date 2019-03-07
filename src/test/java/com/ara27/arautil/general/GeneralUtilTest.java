package com.ara27.arautil.general;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneralUtilTest {

    private GeneralUtil generalUtil = new GeneralUtil();

    @Test
    public void test_getUUID_isString() {
        assertEquals(String.class, generalUtil.getUUID().getClass());
    }
}
