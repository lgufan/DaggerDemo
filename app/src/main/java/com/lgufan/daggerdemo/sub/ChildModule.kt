package com.lgufan.daggerdemo.sub

import dagger.Module
import dagger.Provides

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Module
class ChildModule{

    @Provides
    fun providesChild(): Child {
        return Child()
    }
}