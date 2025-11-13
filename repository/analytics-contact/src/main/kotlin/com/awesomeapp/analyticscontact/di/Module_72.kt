package com.awesomeapp.analyticscontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscontact.Viewmodel72_1
import com.awesomeapp.analyticscontact.Activity72_2
import com.awesomeapp.analyticscontact.Activity72_3
import com.awesomeapp.analyticscontact.Fragment72_4
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.analyticscontact.Model72_7
import com.awesomeapp.analyticscontact.Activity72_8

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api28_6 = Api28_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api40_6 = Api40_6(),
        api3: Api48_6 = Api48_6()
    ): Repository72_5 {
        return Repository72_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}