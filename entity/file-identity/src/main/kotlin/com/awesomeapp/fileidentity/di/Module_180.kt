package com.awesomeapp.fileidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileidentity.Viewmodel180_1
import com.awesomeapp.fileidentity.Activity180_2
import com.awesomeapp.fileidentity.Activity180_3
import com.awesomeapp.fileidentity.Fragment180_4
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.fileidentity.Service180_7
import com.awesomeapp.fileidentity.Worker180_8

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(
        api0: Api120_6 = Api120_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api116_6 = Api116_6(),
        api3: Api112_6 = Api112_6(),
        api4: Api136_6 = Api136_6(),
        api5: Api148_6 = Api148_6(),
        api6: Api156_6 = Api156_6()
    ): Repository180_5 {
        return Repository180_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}