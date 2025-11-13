package com.awesomeapp.pushidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushidentity.Viewmodel148_1
import com.awesomeapp.pushidentity.Activity148_2
import com.awesomeapp.pushidentity.Activity148_3
import com.awesomeapp.pushidentity.Fragment148_4
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.pushidentity.Model148_7
import com.awesomeapp.pushidentity.Activity148_8

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(
        api0: Api92_6 = Api92_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api72_6 = Api72_6(),
        api5: Api84_6 = Api84_6(),
        api6: Api68_6 = Api68_6()
    ): Repository148_5 {
        return Repository148_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}