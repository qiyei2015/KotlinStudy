package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/4.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */


enum class LogLevel{
    VERBOSE,DEBUG,INFO,WARM,ERROR
}

enum class LogLevel2(val id:Int){
    VERBOSE(0),DEBUG(1),INFO(2),WARM(3),ERROR(3)
}

fun main(args: Array<String>) {

    var level1 = LogLevel.WARM
    println(level1)

    var level2 = LogLevel2.ERROR.ordinal
    println(level2)
    var level3 = LogLevel2.WARM.ordinal
    println(level3)
}