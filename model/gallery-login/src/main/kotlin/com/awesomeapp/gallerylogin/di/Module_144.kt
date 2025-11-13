package com.awesomeapp.gallerylogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerylogin.Viewmodel144_1
import com.awesomeapp.gallerylogin.Activity144_2
import com.awesomeapp.gallerylogin.Activity144_3
import com.awesomeapp.gallerylogin.Fragment144_4
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.gallerylogin.Model144_7
import com.awesomeapp.gallerylogin.Activity144_8

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api64_6 = Api64_6(),
        api1: Api60_6 = Api60_6(),
        api2: Api80_6 = Api80_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api92_6 = Api92_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}