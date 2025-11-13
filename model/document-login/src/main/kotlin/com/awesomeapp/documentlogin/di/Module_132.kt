package com.awesomeapp.documentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Viewmodel132_1
import com.awesomeapp.documentlogin.Activity132_2
import com.awesomeapp.documentlogin.Activity132_3
import com.awesomeapp.documentlogin.Fragment132_4
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.documentlogin.Model132_7
import com.awesomeapp.documentlogin.Activity132_8

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api88_6 = Api88_6(),
        api1: Api52_6 = Api52_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api80_6 = Api80_6(),
        api5: Api68_6 = Api68_6(),
        api6: Api60_6 = Api60_6(),
        api7: Api56_6 = Api56_6()
    ): Repository132_5 {
        return Repository132_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}