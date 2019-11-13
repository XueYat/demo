package com.ch03.advancedfeatures.ch06;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author YatXue
 * @date 2019/6/20 18:35
 */
public class Aa {
    public static void test5(){
        Date date=new Date();
        B b = new B();
        B b1 = new B();
        B b2 = new B();
        b.setA(0);
        b.setTime(date);
        b1.setA(2);
        b1.setTime(date);
        b2.setA(3);
        b2.setTime(date);
        List<B> list = new ArrayList<>();
        list.add(b);
        list.add(b1);
        list.add(b2);
        System.out.println(JSON.toJSONString(date));
        //默认格式为yyyy-MM-dd HH:mm:ss
        System.out.println(JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat));
        //根据自定义格式输出日期
        String str = JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd");
        System.out.println(str);
    }
    public static void main(String[] args) {
        test5();
    }
}
