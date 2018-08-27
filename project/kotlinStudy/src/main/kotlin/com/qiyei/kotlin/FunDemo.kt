package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/26.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args: Array<String>) {

    println(sum0(10,85))
    println(sum(10,8))
    println(sum2(4,8,5))
    println(sum3(5,6,9))
}

/**
 * 匿名函数
 */
val sum0 = fun(a:Int,b:Int):Int{
    return a+b
}


//lambda 表达式
val sum = {a:Int,b:Int -> a+b}

val sum2 = {a:Int,b:Int,c:Int ->
    println("$a + $b + $c = ${a+b+c}")
    //返回的是Unit
}

/**
 * lambda返回的是最后一个表达式值
 */
val sum3 = {a:Int,b:Int,c:Int ->
    println("$a + $b + $c = ${a+b+c}")
    //返回的是string
    "hello"
}