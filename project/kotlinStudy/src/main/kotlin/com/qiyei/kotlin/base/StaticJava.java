package com.qiyei.kotlin.base;

import com.qiyei.kotlin.Latitude;

/**
 * @author Created by qiyei2015 on 2018/9/3.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
public class StaticJava {

    public static void main(String[] args){
        Latitude latitude = Latitude.Companion.ofDouble(20);
        System.out.println(Latitude.TAG);

        System.out.println(ExtendMethodKt.multifyPrintln("DEA",5));
    }
}
