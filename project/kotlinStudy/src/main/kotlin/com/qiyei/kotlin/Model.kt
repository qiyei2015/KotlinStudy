package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/24.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
class Model {
    val a = 5;
    var b = 3;
}

fun main(args: Array<String>) {
    val mode1 = Model()
    //mode1.a = 10;
    mode1.b = 4;

    print(mode1.a)
}