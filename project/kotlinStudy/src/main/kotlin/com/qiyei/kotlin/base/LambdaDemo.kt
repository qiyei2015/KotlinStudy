package com.qiyei.kotlin.base

import com.qiyei.kotlin.base.User

/**
 * @author Created by qiyei2015 on 2018/10/4.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args: Array<String>) {

    run{ println(45)}

    val people = listOf(User(1, "张三", 14, "男"), User(2, "李四", 16, "女"))
    println("年纪最大:" + people.maxBy { it.age })

    println("年纪最大:" + people.maxBy ({user: User -> user.age }))
    println("年纪最大:" + people.maxBy(){user: User -> user.age })
    println("年纪最大:" + people.maxBy{user: User -> user.age })

    println("年纪最大:" + people.maxBy{user -> user.age })

people.map {  }
    lambdaTest1(3){"hello:" + it}
    lambdaTest2({"hello:" + it},5)
    lambdaTest3({arg1, arg2 ->  "hello:$arg1 + $arg2"},58)

    val sum = {a:Int,b:Int -> a+b}

    println(sum(2,9))
}

fun lambdaTest1(a:Int,b: (String) -> String){
    println("$a + ${b(a.toString())}")
}

fun lambdaTest2(b: (String) -> String,a:Int){
    println("$a + ${b(a.toString())}")
}

fun lambdaTest3(b: (arg1:String,arg2:Int) -> String,a:Int){
    println("$a + ${b(a.toString(),100)}")
}

