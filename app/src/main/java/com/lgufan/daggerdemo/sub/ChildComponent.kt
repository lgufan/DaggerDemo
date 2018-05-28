package com.lgufan.daggerdemo.sub

import dagger.Subcomponent

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Subcomponent(modules = [(ChildModule::class)])
interface ChildComponent {

    fun inject(activity: SubActivity)
}