package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/31.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

interface A{
    //接口中声明了属性
    var j:Int
    fun a()
}

interface B{
    fun b(c:String)
    fun b2(c:String) = { println("invoke b2 in B")}
}


/**
 * D1 复写了j
 */
class D1(override var j:Int):A,B{
    override fun a() {
        println("D1 a $j")
    }

    override fun b(c: String) {
        j = c.toInt()
        println("D1 b $j")
    }

}

/**
 * D2也复写了j
 */
class D2:A,B{
    override var j: Int = 2
        get() = field
        set(value) {
            field = value
        }

    override fun a() {
        //未赋值，取默认值
        println("D1 a $j")
    }

    override fun b(c: String) {
        j = c.toInt()
        println("D2 b $j")
        var fc = ForbiddenCity()

    }
}

fun main(args: Array<String>) {

    val d1 = D1(20)
    d1.a()
    d1.b("56")

    val d2 = D2()
    d2.a()
    d2.b("5")


}

