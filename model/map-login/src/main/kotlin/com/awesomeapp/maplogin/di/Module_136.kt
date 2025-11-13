package com.awesomeapp.maplogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.maplogin.Viewmodel136_1
import com.awesomeapp.maplogin.Activity136_2
import com.awesomeapp.maplogin.Activity136_3
import com.awesomeapp.maplogin.Fragment136_4
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.maplogin.Model136_7
import com.awesomeapp.maplogin.Activity136_8

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api92_6 = Api92_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api76_6 = Api76_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api60_6 = Api60_6(),
        api5: Api84_6 = Api84_6(),
        api6: Api72_6 = Api72_6(),
        api7: Api68_6 = Api68_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
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
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}