package com.awesomeapp.groupidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupidentity.Viewmodel164_1
import com.awesomeapp.groupidentity.Activity164_2
import com.awesomeapp.groupidentity.Activity164_3
import com.awesomeapp.groupidentity.Fragment164_4
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.groupidentity.Model164_7
import com.awesomeapp.groupidentity.Activity164_8

@Module
@InstallIn(SingletonComponent::class)
object Module_164 {
    @Provides
    @Singleton
    fun provideRepository164_5(
        api0: Api96_6 = Api96_6(),
        api1: Api120_6 = Api120_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api156_6 = Api156_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api148_6 = Api148_6()
    ): Repository164_5 {
        return Repository164_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi164_6(): Api164_6 {
        return Api164_6()
    }
}