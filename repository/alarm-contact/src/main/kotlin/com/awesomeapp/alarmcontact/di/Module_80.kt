package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.alarmcontact.Service80_7
import com.awesomeapp.alarmcontact.Worker80_8

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api36_6 = Api36_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api48_6 = Api48_6(),
        api3: Api44_6 = Api44_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}