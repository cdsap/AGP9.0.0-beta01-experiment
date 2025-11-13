package com.awesomeapp.task.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.task.Viewmodel28_1
import com.awesomeapp.task.Activity28_2
import com.awesomeapp.task.Activity28_3
import com.awesomeapp.task.Fragment28_4
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.task.Model28_7
import com.awesomeapp.task.Activity28_8

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideRepository28_5(
        api0: Api24_6 = Api24_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api16_6 = Api16_6()
    ): Repository28_5 {
        return Repository28_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi28_6(): Api28_6 {
        return Api28_6()
    }
}