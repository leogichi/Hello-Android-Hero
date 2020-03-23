package com.helloandroidhero.root

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//=====================================================================================================================
@Module
class ApplicationModule (
    //                                                     //Receive a Application class and asign to fun
    private var application : Application
){
    @Provides
    @Singleton
    fun provideContext() = application
}

//=====================================================================================================================
/*END-TASK*/