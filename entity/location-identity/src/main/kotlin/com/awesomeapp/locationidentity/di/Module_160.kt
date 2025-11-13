package com.awesomeapp.locationidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Viewmodel160_1
import com.awesomeapp.locationidentity.Activity160_2
import com.awesomeapp.locationidentity.Activity160_3
import com.awesomeapp.locationidentity.Fragment160_4
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.locationidentity.Service160_7
import com.awesomeapp.locationidentity.Worker160_8

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api108_6 = Api108_6(),
        api1: Api136_6 = Api136_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api104_6 = Api104_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}