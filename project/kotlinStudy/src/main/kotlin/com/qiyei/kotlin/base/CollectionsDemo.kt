package com.qiyei.kotlin.base

/**
 * @author Created by qiyei2015 on 2018/10/21.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */


fun main(args: Array<String>) {

    val list = arrayListOf<User>(User(1, "张三", 14, "男"), User(2, "李四", 16, "女"),
            User(3, "王五", 65, "男"), User(4, "赵六", 24, "男")
            , User(5, "向七", 89, "女"), User(6, "王八", 6, "女")
            , User(7, "韩九", 27, "男"), User(8, "陈10", 35, "女"))

    //测试filter
    val filterList = list.filter { it.age > 30 }
    println(filterList)

    //测试map
    val mapList = list.map { it.name }
    println(mapList)

    //测试all
    val all = list.all { it.age > 10 }
    println(all)

    //测试any
    val any = list.any { it.age > 10 }
    println(any)

    //测试count
    val count = list.count { it.age > 25 }
    println(count)

    //测试find
    val find = list.find { it.age > 25 }
    println(find)

    //测试groupBy
    val groupBy = list.groupBy { it.sex}
    println(groupBy)

    var citys = arrayListOf<City>()
    citys.add(City("CD", arrayListOf(User(1, "张三", 14, "男"), User(2, "李四", 16, "女"),
            User(3, "王五", 65, "男"))))
    citys.add(City("CD", arrayListOf(User(5, "向七", 89, "女"), User(6, "王八", 6, "女"))))
    //测试flatMap
    val flatmap = citys.flatMap {
        it.people
    }
    println(flatmap)
}

class City(val name:String,val people:List<User>){

    override fun toString(): String {
        return "City(name='$name', people=$people)"
    }
}

