package com.task.myBoard.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatUtil {

    /**
     * 현재 시간을 yyyyMMddHHmmss 포맷으로 리턴.
     * @return
     */
    public static String getTimeStamp(){
        //Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateString = localDateTime.format(formatter);
        return dateString;
    }
}
