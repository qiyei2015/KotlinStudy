package com.qiyei.kotlin.io

import java.io.File

/**
 * @author Created by qiyei2015 on 2020/6/13.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

fun main() {


    val input: File = File("韩锦Xxx的常用名字.txt")
    val output:File = File("kotlin_out.txt")
    val bufferedWriter = output.bufferedWriter()
    input.bufferedReader().forEachLine {
        println(it)
        bufferedWriter.write(it+"\n")
    }

    val read = readLine()
    println(read)
}


