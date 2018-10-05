package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.net.SocketPermission;
import java.util.Date;

/**
 * @Author: fanhao
 * @Date: 2018/10/5 20:01
 * @Version 1.0
 */
public class DateTimeUtils {

    //jida-time

    //str->Date
    //Date->str

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String dateTimeStr,String formatStr) {
        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormat.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date, String formatStr) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString();
    }

    public static String dateToStr(Date date) {
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static Date strToDate(String dateTimeStr) {
        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormat.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }


    public static void main(String[] args) {
        System.out.println(DateTimeUtils.dateToStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateTimeUtils.strToDate("2010-01-01 11:11:11", "yyyy-MM-dd HH:mm:ss"));
    }
}
