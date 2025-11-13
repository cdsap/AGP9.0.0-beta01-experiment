package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.checkoutidentity.Model152_7
import com.awesomeapp.checkoutidentity.Activity152_8

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api88_6 = Api88_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api64_6 = Api64_6(),
        api4: Api68_6 = Api68_6(),
        api5: Api76_6 = Api76_6(),
        api6: Api92_6 = Api92_6(),
        api7: Api52_6 = Api52_6(),
        api8: Api84_6 = Api84_6(),
        api9: Api56_6 = Api56_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
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
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}