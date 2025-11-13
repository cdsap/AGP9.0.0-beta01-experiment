package com.awesomeapp.calendaridentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendaridentity.Viewmodel176_1
import com.awesomeapp.calendaridentity.Activity176_2
import com.awesomeapp.calendaridentity.Activity176_3
import com.awesomeapp.calendaridentity.Fragment176_4
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.calendaridentity.Model176_7
import com.awesomeapp.calendaridentity.Activity176_8

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api120_6 = Api120_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api144_6 = Api144_6(),
        api3: Api116_6 = Api116_6(),
        api4: Api96_6 = Api96_6(),
        api5: Api128_6 = Api128_6(),
        api6: Api132_6 = Api132_6(),
        api7: Api100_6 = Api100_6(),
        api8: Api104_6 = Api104_6(),
        api9: Api136_6 = Api136_6(),
        api10: Api108_6 = Api108_6()
    ): Repository176_5 {
        return Repository176_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}