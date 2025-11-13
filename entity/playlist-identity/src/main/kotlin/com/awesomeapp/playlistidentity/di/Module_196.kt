package com.awesomeapp.playlistidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistidentity.Viewmodel196_1
import com.awesomeapp.playlistidentity.Activity196_2
import com.awesomeapp.playlistidentity.Activity196_3
import com.awesomeapp.playlistidentity.Fragment196_4
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.playlistidentity.Model196_7
import com.awesomeapp.playlistidentity.Activity196_8

@Module
@InstallIn(SingletonComponent::class)
object Module_196 {
    @Provides
    @Singleton
    fun provideRepository196_5(
        api0: Api144_6 = Api144_6()
    ): Repository196_5 {
        return Repository196_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi196_6(): Api196_6 {
        return Api196_6()
    }
}