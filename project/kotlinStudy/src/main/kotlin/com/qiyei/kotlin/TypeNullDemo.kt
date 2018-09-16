package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/16.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description: 可空类型Demo
 */

fun main(args: Array<String>) {
    //可空类型
    var name:String? = null
    //非空类型
    var personName:String = "娃哈哈"

    var length:Int = if (name != null) name.length else 0
    var len:Int? = name?.length
    //error
//    getLength(name)
    var length2:Int = name?.length?:0

    //ok
    //name = personName;
    // error
    personName = name?:""

}

fun getLength(s:String):Int = s.length


class People(val name:String,val age:Int){

    override fun equals(other: Any?): Boolean {
        var another = other as? People?:return false

        return another.name == name && another.age == age
    }

    override fun hashCode(): Int {
        return age.hashCode()*31 + name.hashCode()
    }
}

fun ignoreNulls(s:String?){
    var str = s!!
    println(str.length)
}