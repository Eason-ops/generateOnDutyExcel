package com.hxzy.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommonUtil {

    public static Collection<String> getValues(String path){
        InputStream resourceAsStream = CommonUtil.class.getResourceAsStream(path);
        InputStreamReader isr = new InputStreamReader(resourceAsStream);
        BufferedReader reader = new BufferedReader(isr);
        List<String> list = new ArrayList<>();

        while (true) {
            try {
                String s = reader.readLine();
                if (s != null) {
                    list.add(s);
                } else {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
