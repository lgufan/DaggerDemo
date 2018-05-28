package com.lgufan.daggerdemo.basic

import dagger.Component

/**
 * 创建者 : lyj
 * 时间 : 2018/5/17 0017
 * 公司 : 工博
 * 功能 :
 */
@Component(modules = [(MainModule::class)])
interface MainComponent {

    fun inject(activity: MainActivity)

}