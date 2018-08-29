package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/8/29.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description: 简单的计算器例子，输入运算表达式，然后来计算
 */

fun main(args: Array<String>) {

    while (true){
        val arg1: Double
        val op: String
        val arg2: Double
        try {
            println("请输入算式，例如 3 + 4 ")
            var input = readLine()?:break
            //去掉两端多余空格
            var splits = input.trim().split(" ")
            if (splits.size < 3){
                throw IllegalArgumentException("参数异常")
            }
            arg1 = splits[0].toDouble()
            op = splits[1]
            arg2 = splits[2].toDouble()
            //打印结果
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1,arg2)}")
        } catch (e: IllegalArgumentException) {
            println("参数异常")
        }catch (e:NumberFormatException){
            println("输入的表达式错误")
        }catch (e:Exception){
            println("未知异常")
        }
        println("再来一发! [Y]")
        val cmd = readLine()?:break
        //不等于y
        if (cmd.toLowerCase() != "y" && cmd != ""){
            break
        }
    }
    println("程序结束，感谢使用！")
}

/**
 * 定义操作的类
 */
class Operator(op:String){

    /**
     * 定义属性operate,类型是lambda表达式
     */
    var operate:(left:Double,right:Double) -> Double

    init {
        operate = when(op){
            "+" -> {l,r -> l+r}
            "-" -> {l,r -> l-r}
            "*" -> {l,r -> l*r}
            "/" -> {l,r -> l/r}
            "%" -> {l,r -> l%r}
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    /**
     * 定义方法
     */
    fun apply(left:Double,right:Double):Double{
        return operate(left,right)
    }
}