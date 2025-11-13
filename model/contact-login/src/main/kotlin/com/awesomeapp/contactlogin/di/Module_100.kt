package com.awesomeapp.contactlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactlogin.Viewmodel100_1
import com.awesomeapp.contactlogin.Activity100_2
import com.awesomeapp.contactlogin.Activity100_3
import com.awesomeapp.contactlogin.Fragment100_4
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.contactlogin.Service100_7
import com.awesomeapp.contactlogin.Worker100_8

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(
        api0: Api80_6 = Api80_6()
    ): Repository100_5 {
        return Repository100_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}