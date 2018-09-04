package com.qiyei.kotlin

/**
 * @author Created by qiyei2015 on 2018/9/4.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

class Outter{
    var a:String = "Outter"
    /**
     * 默认是静态内部类
     */
    class Inner{
        init {
            //println(a)
        }
    }

    //非静态内部类 持有外部类的引用
    inner class Inner2{
        init {
            println(a)
        }
    }
}

interface OnClickListener{
    fun click()
}

class View{
    var listner:OnClickListener? = null
}


fun main(args: Array<String>) {
    var inner = Outter.Inner()
    //非静态内部类
    var inner2 = Outter().Inner2()

    var view = View()
    //匿名内部类 object 实现了接口
    view.listner = object :OnClickListener{
        override fun click() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}