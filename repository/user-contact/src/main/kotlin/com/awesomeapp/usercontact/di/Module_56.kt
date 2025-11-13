package com.awesomeapp.usercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercontact.Viewmodel56_1
import com.awesomeapp.usercontact.Activity56_2
import com.awesomeapp.usercontact.Activity56_3
import com.awesomeapp.usercontact.Fragment56_4
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.usercontact.Model56_7
import com.awesomeapp.usercontact.Activity56_8

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(
        api0: Api32_6 = Api32_6(),
        api1: Api40_6 = Api40_6(),
        api2: Api44_6 = Api44_6()
    ): Repository56_5 {
        return Repository56_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}