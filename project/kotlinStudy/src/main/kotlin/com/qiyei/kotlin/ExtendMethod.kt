package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/3.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args: Array<String>) {

    println("ABCDE".multifyPrintln(5))
}

/**
 * String的扩展方法 . 也可以定义扩展属性
 */
fun String.multifyPrintln(n:Int):String{
    var builder = StringBuilder()
    for (i in 0 until n){
        builder.append(this)
    }
    return builder.toString()
}