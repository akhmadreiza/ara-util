package com.ara27.arautil;

import com.ara27.arautil.general.GeneralUtil;

import java.io.File;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

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

        String sms = String.format("Yth Nasabah, Home Credit Card Anda diterima oleh %s,%s di alamat pngiriman Anda. Jk penerima tdk dikenal/blm diterima,hub. HomeCredit: 02129539600", "testing", "27/10/1991");
        System.out.println("sms: "+sms);

        System.out.println("oldDateFormat: 22-04-2018 18:05:58");
        System.out.println("newDateFormat: "+generalUtil.changeDateFormat("22-04-2018 18:05:58"));

        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(0);

        String testingFormat = format.format(0);
        System.out.println(testingFormat);

        String fileName = "disbursement-0000010-20190814.zip";
        File file = new File("D:\\fileTest\\temp-dir\\filelist");
        File[] files = file.listFiles();

        for (File file1 : files) {
            System.out.println(file1.getName());
            if (file1.getName().contains(".rpt")) {
                String fileName1 = file1.getName().substring(0, file1.getName().indexOf(".rpt"));
                System.out.println(fileName1);
                String[] fileNameArray = fileName1.split("-");
                for (String s : fileName1.split("-")) {
                    System.out.println(s);
                }
            }
        }

        System.out.println(fileName.substring(fileName.indexOf(".zip") - 8, fileName.indexOf(".zip")));
        System.out.println(fileName.substring(0, fileName.indexOf(".zip")));
    }
}
