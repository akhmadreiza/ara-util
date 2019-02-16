package com.ara27.arautil;

import com.ara27.arautil.general.GeneralUtil;

import java.time.format.DateTimeFormatter;
import static com.ara27.arautil.constants.DateFormatConstants.*;

public class Main {

    static GeneralUtil generalUtil = new GeneralUtil();

    public static void main(String[] args) {
        String uuid = generalUtil.getUUID();
        System.out.println(uuid);
        String currDateWith24HRFormat = generalUtil.getFormattedCurrentLocalDateTime(DateTimeFormatter.ofPattern(DATE_WITH_24HR));
        String currDate = generalUtil.getFormattedCurrentLocalDateTime(DateTimeFormatter.ofPattern(DATE_ONLY));
        String currDateWithDefaultFormat = generalUtil.getCurrentLocalDateTime();
        System.out.println(currDateWith24HRFormat);
        System.out.println(currDateWithDefaultFormat);
        System.out.println(currDate);
    }
}
