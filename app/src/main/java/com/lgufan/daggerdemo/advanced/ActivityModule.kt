package com.lgufan.daggerdemo.advanced

import android.content.Context
import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * 创建者 : lyj
 * 时间 : 2018/5/25 0025
 * 公司 : 工博
 * 功能 :
 */
@Module
class ActivityModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideContext():Context{
        return context
    }
}