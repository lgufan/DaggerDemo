package com.lgufan.daggerdemo.advanced

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Module
class DependenciesModule {

    @DependenciesScope
    @Provides
    fun provideSharePreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("app", Context.MODE_PRIVATE)
    }

}