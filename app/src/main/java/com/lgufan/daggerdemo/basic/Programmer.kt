package com.lgufan.daggerdemo.basic

import android.content.Context
import android.widget.Toast
import com.lgufan.daggerdemo.basic.IJob

/**
 * 创建者 : lyj
 * 时间 : 2018/5/21 0021
 * 公司 : 工博
 * 功能 :
 */
class Programmer(val content:String) : IJob {

    override fun work(context: Context) {
        Toast.makeText(context, "工作内容：$content", Toast.LENGTH_SHORT).show()
    }

}