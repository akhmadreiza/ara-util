package com.ara27.arautil.general;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import static com.ara27.arautil.constants.DateFormatConstants.DEFAULT_DATE_FORMAT;

public class GeneralUtil {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public String getCurrentLocalDateTime() {
        return DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT).format(LocalDateTime.now());
    }

    public String getFormattedCurrentLocalDateTime(DateTimeFormatter dtf) {
        return dtf.format(LocalDateTime.now());
    }

    public String changeDateFormat(String oldDateFormat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(oldDateFormat, formatter);
        return DateTimeFormatter.ofPattern("dd/MM/yy").format(dateTime);
    }

    public String changeDateFormat(DateTimeFormatter oldDtf, String oldDateFormat) {
        LocalDateTime dateTime = LocalDateTime.parse(oldDateFormat, oldDtf);
        return DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT).format(dateTime);
    }

    public String changeDateFormat(DateTimeFormatter oldDtf, DateTimeFormatter newDtf, String oldDateFormat) {
        LocalDateTime dateTime = LocalDateTime.parse(oldDateFormat, oldDtf);
        return newDtf.format(dateTime);
    }

}
