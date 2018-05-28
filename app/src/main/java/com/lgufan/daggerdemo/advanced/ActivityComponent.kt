package com.lgufan.daggerdemo.advanced

import android.content.Context
import dagger.Component
import javax.inject.Singleton

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Singleton
@Component(modules = [(ActivityModule::class)])
interface ActivityComponent {

    fun getContext():Context
}