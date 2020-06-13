package com.qiyei.kotlin.base;

/**
 * @author Created by qiyei2015 on 2018/8/27.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
public class Demo {


    public static void main(String[] args){
        testBreakLabel();
    }

    static void testBreakLabel(){
        for (int i = 0 ;i < 100;i++){
            for (int j = 0; j < 100 ;j++){
                System.out.println(" i = "+ i +" j = " + j);
                if (i == 2 && j == 2){
                    break;
                }
            }
        }
    }

}
