package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/1.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

class House

class Flower



class Countyard{
    private var house:House = House()

    private var flower:Flower = Flower()

}

open class ForbiddenCity{
    var houses = arrayOf(House(),House())

    protected var flowers:Array<Flower> = arrayOf(Flower(), Flower())

}

class SubForbiddenCity: ForbiddenCity() {

    fun getFlowersFor():Array<Flower>{
        return flowers
    }
}


fun main(args: Array<String>) {

    var countyard:Countyard = Countyard()
    var fc = ForbiddenCity()
//    println(countyard.house)
    fc.houses.forEach {
        println(it)
    }

    //无法访问
//    println(fc.flowers)

}