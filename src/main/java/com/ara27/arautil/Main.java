package com.ara27.arautil;

import com.ara27.arautil.general.GeneralUtil;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import static com.ara27.arautil.constants.DateFormatConstants.*;

public class Main {

    static GeneralUtil generalUtil = new GeneralUtil();

    public static void main(String[] args) {
//        String uuid = generalUtil.getUUID();
//        System.out.println(uuid);
//        String currDateWith24HRFormat = generalUtil.getFormattedCurrentLocalDateTime(DateTimeFormatter.ofPattern(DATE_WITH_24HR));
//        String currDate = generalUtil.getFormattedCurrentLocalDateTime(DateTimeFormatter.ofPattern(DATE_ONLY));
//        String currDateWithDefaultFormat = generalUtil.getCurrentLocalDateTime();
//        System.out.println(currDateWith24HRFormat);
//        System.out.println(currDateWithDefaultFormat);
//        System.out.println(currDate);
//
//        String sms = String.format("Yth Nasabah, Home Credit Card Anda diterima oleh %s,%s di alamat pngiriman Anda. Jk penerima tdk dikenal/blm diterima,hub. HomeCredit: 02129539600", "testing", "27/10/1991");
//        System.out.println("sms: "+sms);
//
//        System.out.println("oldDateFormat: 22-04-2018 18:05:58");
//        System.out.println("newDateFormat: "+generalUtil.changeDateFormat("22-04-2018 18:05:58"));

        HttpDeleteWithBody httpDeleteWithBody = new HttpDeleteWithBody();

        try {
            String body = "{\"inboxs\":[\"5e83ba20-0112-441f-9122-a7aeb455300a\"],\"pointer\":1557299879228}";
            String token = "Bearer eyJhbGciOiJkaXIiLCJlbmMiOiJBMTI4Q0JDLUhTMjU2Iiwia2lkIjpudWxsLCJjdHkiOiJKV1QifQ..2Ai2OOhKFvsDtl1q-JYgwg.4BQaSHPjGai4Lw6dOn0XEaMP6JKdwFYfB9CPXmH3BKJyk460-kRC0FpfhbrF41E5qQxA9Jqysj0CTHEPc5ptjpCSnaTjDt_GnEeC--H-yxgjkc7s1WZWR-ZdfyJKCQdOwrxOABQR8RSQR42hJ14QNXfC6jU-hLvPmTGNa2P_ahtMhFQ3qRIJTyI_RSJWuEgPW4BDzhaKaAFdkiZ4KKX4d4BSWen4AjJgJhM9vyVh8C8t4dYaD12ofYstqOPEHUjxqC5700bGMTEq1ZQyHdwHO7M40a2JkUv-98MlZ6a13dJt5Ts7ZojlvCfuR7ArVD8TKZwvB8TauAHs7ICNtTlyfHD0KAnrtoow58DB0OMKAJdrrUTyrdKXQAhAaqg_GgRiIOBTVEY3xuP8ZQIsEdF-OJhq4MWjIf_xXBASKRYTK-8gzl8lcoLmGoakSZ8_NZTSn7LbLQ2fyTGR8huQQVJ-qrPxns2RpZQCsMFylZxl3I4.ay2J0jpkv91Bvs62F6JVdw";
            String[] testing = httpDeleteWithBody.sendDelete("https://dev.homecredit.co.id/portal-api-r2/inbox/", body, token);
            for (String test : testing) {
                System.out.println(test);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
