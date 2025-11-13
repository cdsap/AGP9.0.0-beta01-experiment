package com.awesomeapp.notecontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecontact.Viewmodel84_1
import com.awesomeapp.notecontact.Activity84_2
import com.awesomeapp.notecontact.Activity84_3
import com.awesomeapp.notecontact.Fragment84_4
import com.awesomeapp.notecontact.Repository84_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.notecontact.Model84_7
import com.awesomeapp.notecontact.Activity84_8

@Module
@InstallIn(SingletonComponent::class)
object Module_84 {
    @Provides
    @Singleton
    fun provideRepository84_5(
        api0: Api36_6 = Api36_6(),
        api1: Api44_6 = Api44_6(),
        api2: Api28_6 = Api28_6()
    ): Repository84_5 {
        return Repository84_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi84_6(): Api84_6 {
        return Api84_6()
    }
}