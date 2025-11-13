package com.awesomeapp.videocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videocheckout.Viewmodel240_1
import com.awesomeapp.videocheckout.Activity240_2
import com.awesomeapp.videocheckout.Activity240_3
import com.awesomeapp.videocheckout.Fragment240_4
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.videocheckout.Service240_7
import com.awesomeapp.videocheckout.Worker240_8

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api228_6 = Api228_6(),
        api1: Api224_6 = Api224_6(),
        api2: Api220_6 = Api220_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}