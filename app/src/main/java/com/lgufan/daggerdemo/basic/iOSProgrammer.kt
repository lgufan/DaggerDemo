package com.lgufan.daggerdemo.basic

import android.content.Context
import android.widget.Toast

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
class iOSProgrammer: IJob {

    override fun work(context: Context) {
        Toast.makeText(context, "工作内容：开发iOSApp", Toast.LENGTH_SHORT).show()
    }
}