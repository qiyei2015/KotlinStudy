package com.qiyei.kotlin.base

/**
 * @author Created by qiyei2015 on 2018/9/3.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */


fun main(args: Array<String>) {
    var china = Country(2,"china")
    println(china)

    println(china.component1())

    println(china.component2())

    for ((index,value) in args.withIndex()){
        println(index)
        print(value)
    }
}

/**
 * 数据类 javabean
 */
data class Country(val id:Int = 0,val name:String = "")