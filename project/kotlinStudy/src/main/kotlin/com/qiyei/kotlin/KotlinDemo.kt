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

//    //检查为不为null才输出长度
//    println(getName()?.length)
//
//    getName()?:return
//    println("${getName() == null}")
//
//    var value:String? = "hello"
//    //定义一个可空类型，但是强制告诉编译器不为null
//    println(value!!.length)
//
//    var value2:String? = getValue()
//    //定义一个可空类型，但是强制告诉编译器不为null
//    println(value2!!.length)

//    var user:User? = null
//    //如果user如果为null，就返回
//    val arg = user?: return
//    println(arg)
//

//    testReturnLabel()
//    testReturnLabel2()
    testReturnLabel3()

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


fun testBreakLabel(){
    loop@for(i in 1..100){
        for (j in 1..100){
            println(" i = $i j = $j")
            if (i== 2 && j == 2){
//                //默认退出的是内层循环,最直接包围它的循环
//                break
                //退出到标签循环
                break@loop
            }
        }
    }
}

fun testReturnLabel(){

    listOf(1,2,3,4,5).forEach {
        if (it == 3){
            //直接return testReturnLabel的调用
            //return
            return@forEach
        }
        println("i = $it")
    }
    println("testReturnLabel end")
}

fun testReturnLabel2(){

    run lint@{ listOf(1,2,3,4,5).forEach (fun (value:Int){
        if (value == 3){
            //直接return testReturnLabel的调用
//            return
            return@lint
        }
        println("i = $value")
    }) }
    println("testReturnLabel2 end")
}

fun testReturnLabel3(){

    run lint@{ listOf(1,2,3,4,5).forEach {
        if (it == 3){
            //return lint 类似于在lint处continue了
            return@lint
        }
        println("i = $it")
    }}
    println("testReturnLabel3 end")
}