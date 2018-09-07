package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/4.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description: 密封类，子类有限的类
 */

sealed class PlayerCmd {

}

class Play(val url:String):PlayerCmd(){

}

class Seek(val position:Long):PlayerCmd(){

}

object Pause:PlayerCmd(){

}

object Resume:PlayerCmd(){

}

object Stop:PlayerCmd(){

}


fun main(args: Array<String>) {

}