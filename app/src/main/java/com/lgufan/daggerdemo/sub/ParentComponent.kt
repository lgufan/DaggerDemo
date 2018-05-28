package com.lgufan.daggerdemo.sub

import dagger.Component
import javax.inject.Singleton

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Singleton
@Component(modules = [(ParentModule::class)])
interface ParentComponent {

    fun addSub(module: ChildModule): ChildComponent
}