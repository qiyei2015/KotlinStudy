package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/22.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

class User(val id:Int,var name:String,var age:Int,val sex:String){

    init {
        //println(toString())
    }

    override fun toString(): String {
        return "User(id=$id, name='$name', age=$age, sex='$sex')"
    }
}