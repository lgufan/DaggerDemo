package com.lgufan.daggerdemo.sub

import javax.inject.Inject

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
class Child @Inject constructor() {

    fun getChildName():String{
        return "孩子"
    }
}