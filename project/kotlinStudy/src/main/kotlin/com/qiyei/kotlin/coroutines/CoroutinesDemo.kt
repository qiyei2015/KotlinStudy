package com.qiyei.kotlin.coroutines

import kotlinx.coroutines.*

/**
 * @author Created by qiyei2015 on 2020/6/13.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main(args: Array<String>) {


    //1 GlobalScope 启动协程
//    val job = GlobalScope.launch(Dispatchers.IO) {
//        delay(100)
//        println("GlobalScope hello,thead=${Thread.currentThread().name}")
//    }

//    //2 android launch协程
//    val  mainScope = MainScope()
//    mainScope.launch {
//        delay(100)
//        println("mainScope hello,thead=${Thread.currentThread().name}")
//    }

    //3 自定义协程
//    val coroutineScope = CoroutineScope(Dispatchers.Unconfined)
//    coroutineScope.launch {
//        delay(100)
//        println("coroutineScope hello,thead=${Thread.currentThread().name}")
//    }
//
//    //阻塞当前线程
//    val ret = runBlocking {
//        delay(50)
//        println("world")
//        367
//    }
//    println("runBlocking ret=$ret")
//
//    val coroutineScope2 = CoroutineScope(Dispatchers.Unconfined)
//    coroutineScope2.launch {
//        println("enter coroutineScope2 ,thead=${Thread.currentThread().name}")
//        val name = async { getName() }
//        println("coroutineScope2 ,name=${name.await()}")
//        withContext(Dispatchers.Default){
//            println("withContext coroutineScope2 ,thead=${Thread.currentThread().name}")
//        }
//    }

    testDemo()

    Thread.sleep(5000)
    println("main end")
}


private suspend fun getName():String{
    delay(50)
    withContext(Dispatchers.IO){
        111
    }
    return "哈哈哈哈哈哈或或或或或或或或或"
}

private fun testDemo(){
    GlobalScope.launch(Dispatchers.Unconfined) {
        val name = withContext(Dispatchers.IO){
            return@withContext getName()
        }
        val age = async { getAge() }
        withContext(Dispatchers.Default){
            println("testDemo name=$name age=${age.await()}")
        }
    }

}

private suspend fun getAge():Int {
    delay(200)
    return 28
}