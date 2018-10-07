package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/10/7.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args: Array<String>) {
    //传递lambda表达式
    highFunction1{
        a,b -> a+b
    }
    highFunction1{
        a,b -> a*b
    }
    //直接传递函数
    highFunction1(::multiply)

    //使用高阶函数
    val res = highFunction2("A")
    println(res(20)) //打印2000
    val res2 = highFunction2("B")
    println(res2(20)) //打印30
}

/**
 * 操作两个数
 */
fun highFunction1(operation:(Int,Int)->Int){
    val result = operation(20,30)
    println("result: $result")
}

/**
 * 两个数相加
 */
fun sum(x:Int,y:Int):Int{
    return x+y
}

/**
 * 两个数相乘
 */
fun multiply(x:Int,y:Int):Int{
    return x * y
}

/**
 * 定义一个返回值是函数的高阶函数
 * @param name 入场
 * @return 返回一个函数或者lambda
 */
fun highFunction2(name:String):(Int) -> Int{
    if (name == "A"){
        return ::returnFun
    }
    //返回lambda
    return {a -> a + 10}
}

/**
 * 作为高阶函数的返回函数
 */
fun returnFun(a:Int):Int{
    return  a * 100
}

