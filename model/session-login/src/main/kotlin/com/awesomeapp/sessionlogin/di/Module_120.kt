package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.sessionlogin.Service120_7
import com.awesomeapp.sessionlogin.Worker120_8

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api68_6 = Api68_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api76_6 = Api76_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api92_6 = Api92_6(),
        api5: Api84_6 = Api84_6(),
        api6: Api60_6 = Api60_6(),
        api7: Api80_6 = Api80_6(),
        api8: Api64_6 = Api64_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}