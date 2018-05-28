package com.lgufan.daggerdemo.basic

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject

/**
 * 创建者 : lyj
 * 时间 : 2018/5/16 0016
 * 公司 : 工博
 * 功能 :
 */
class Person @Inject constructor() {

    var name = ""

    fun test(context: Context){
        Toast.makeText(context,"名字：$name",Toast.LENGTH_SHORT).show()
    }

}


