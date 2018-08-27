package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/27.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

class Complex(var real:Double,var imaginary:Double){

    /**
     * 重载运算符
     */
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real,imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}


fun main(args: Array<String>) {

    var a1 = Complex(10.0,8.0)
    var a2 = Complex(4.8,3.6)

    println(a1+a2)

    //for 循环
    for ((index,value) in args.withIndex()){
        println("$index $value")
    }

    try {
        for (value in args){
            println(value)
        }
    } catch (e: Exception) {

    } finally {

    }
}