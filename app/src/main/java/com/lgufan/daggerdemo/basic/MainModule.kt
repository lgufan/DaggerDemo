package com.lgufan.daggerdemo.basic

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * 创建者 : lyj
 * 时间 : 2018/5/21 0021
 * 公司 : 工博
 * 功能 :
 */
@Module
class MainModule {

    /**
     * 初始化接口
     */
    @Provides
    fun provideIJob(content:String): IJob {
        return Programmer(content)
    }

    /**
     * 初始化第三方
     */
    @Provides
    fun provideGson():Gson{
        return Gson()
    }

    @Provides
    fun provideContent():String{
        return "敲代码"
    }

    @Provides
    fun providePerson(): Person {
        return Person()
    }

    @Named("Android")
    @Provides
    fun provideAndroid():IJob{
        return AndroidProgrammer()
    }

    @Named("iOS")
    @Provides
    fun provideiOS():IJob{
        return iOSProgrammer()
    }

    @AndroidQualifier
    @Provides
    fun provideAndroid2():IJob{
        return AndroidProgrammer()
    }

    @iOSQualifier
    @Provides
    fun provideiOS2():IJob{
        return iOSProgrammer()
    }


}