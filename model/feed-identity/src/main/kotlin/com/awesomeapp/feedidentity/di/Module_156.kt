package com.awesomeapp.feedidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedidentity.Viewmodel156_1
import com.awesomeapp.feedidentity.Activity156_2
import com.awesomeapp.feedidentity.Activity156_3
import com.awesomeapp.feedidentity.Fragment156_4
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.feedidentity.Model156_7
import com.awesomeapp.feedidentity.Activity156_8

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api80_6 = Api80_6(),
        api1: Api84_6 = Api84_6(),
        api2: Api76_6 = Api76_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api52_6 = Api52_6(),
        api5: Api68_6 = Api68_6(),
        api6: Api56_6 = Api56_6(),
        api7: Api60_6 = Api60_6(),
        api8: Api64_6 = Api64_6(),
        api9: Api92_6 = Api92_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}