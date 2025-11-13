package com.awesomeapp.todocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todocheckout.Viewmodel232_1
import com.awesomeapp.todocheckout.Activity232_2
import com.awesomeapp.todocheckout.Activity232_3
import com.awesomeapp.todocheckout.Fragment232_4
import com.awesomeapp.todocheckout.Repository232_5
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.todocheckout.Model232_7
import com.awesomeapp.todocheckout.Activity232_8

@Module
@InstallIn(SingletonComponent::class)
object Module_232 {
    @Provides
    @Singleton
    fun provideRepository232_5(
        api0: Api216_6 = Api216_6(),
        api1: Api212_6 = Api212_6(),
        api2: Api200_6 = Api200_6(),
        api3: Api208_6 = Api208_6(),
        api4: Api204_6 = Api204_6()
    ): Repository232_5 {
        return Repository232_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi232_6(): Api232_6 {
        return Api232_6()
    }
}