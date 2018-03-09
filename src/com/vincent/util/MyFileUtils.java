package com.vincent.util;

import java.util.UUID;

/**
 * @author Vincent
 * @Description:
 * @create 2018-02-14 19:33
 */
public class MyFileUtils {
    /**
     * 获取文件的uuid名称
     * @param fileName
     * @return
     */
    public static String getFileName(String fileName){
        String prefix = UUID.randomUUID().toString().replaceAll("-", "") ;
        String suffix = fileName.substring(fileName.lastIndexOf(".")); //.jpg
        return prefix + suffix;
    }

}
