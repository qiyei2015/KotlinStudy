package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/22.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

class User(var name:String,var age:Int){
    init {
        println("${this.javaClass.simpleName} init:$name $age")
    }

    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }


}