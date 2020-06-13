package com.qiyei.kotlin.base

/**
 * @author Created by qiyei2015 on 2018/9/3.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */

/**
 * 构造方法私有
 */
class Latitude private constructor(val value:Double){

    /**
     * 伴生对象，对应静态成员。
     */
    companion object {

        fun ofDouble(value: Double): Latitude {
            return Latitude(value)
        }

        /**
         * 静态函数？
         */
        @JvmStatic
        fun ofLatitude(value: Double):Latitude{
            return Latitude(value)
        }

        @JvmField
        val TAG:String = "Latitude"
    }


}