package com.awesomeapp.forecastcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Viewmodel236_1
import com.awesomeapp.forecastcheckout.Activity236_2
import com.awesomeapp.forecastcheckout.Activity236_3
import com.awesomeapp.forecastcheckout.Fragment236_4
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.forecastcheckout.Model236_7
import com.awesomeapp.forecastcheckout.Activity236_8

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api224_6 = Api224_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api232_6 = Api232_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}