package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/22.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args:Array<String>){
//    println("hello world")

//    var user:User = User("heihei",20)
//    var user2:User2 = User2("美女",18)
//    var user1:User1 = User1()
//
//    println(user.toString())
//    println(user2.toString())
//
//    println(user2 is Person)

    //检查为不为null才输出长度
    println(getName()?.length)

    getName()?:return
    println("${getName() == null}")

    var value:String? = "hello"
    //定义一个可空类型，但是强制告诉编译器不为null
    println(value!!.length)

    var value2:String? = getValue()
    //定义一个可空类型，但是强制告诉编译器不为null
    println(value2!!.length)
}


open class Person(name:String,age:Int){
    /**
     * 构造方法方法体
     */
    init {
        println("${this.javaClass.simpleName} init:$name $age")
    }
}


class User2(name:String,age:Int):Person(name,age){

    /**
     * 构造方法方法体
     */
    init {
        println("${this.javaClass.simpleName} init:$name $age")
    }

    override fun toString(): String {
        return "name age"
    }
}


fun getName():String?{
    return "shdhfhs"
}

fun getValue():String{
    return "hehehh"
}