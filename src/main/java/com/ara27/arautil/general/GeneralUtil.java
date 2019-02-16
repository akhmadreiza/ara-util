package com.ara27.arautil.general;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import static com.ara27.arautil.constants.DateFormatConstants.*;

public class GeneralUtil {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public String getCurrentLocalDateTime(){
        return DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT).format(LocalDateTime.now());
    }

    public String getFormattedCurrentLocalDateTime(DateTimeFormatter dtf){
        return dtf.format(LocalDateTime.now());
    }

}
