package com.lgufan.daggerdemo.advanced

import dagger.Component

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@DependenciesScope
@Component(dependencies = [(ActivityComponent::class)],modules = [(DependenciesModule::class)])
interface DependenciesComponent {

    fun inject(activity:DependenciesActivity)

}