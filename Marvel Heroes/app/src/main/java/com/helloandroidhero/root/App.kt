package com.helloandroidhero.root

import android.app.Application

//=====================================================================================================================
class App : Application(),IMVPComponent
{

    private lateinit var iappComponent: IApplicationComponent

    override fun onCreate() {
        super.onCreate()

        iappComponent = DaggerIApplicationComponent.builder().applicationModule(ApplicationModule
            (this)).build()

    }

    override fun getComponent(): IApplicationComponent = iappComponent


}
interface IMVPComponent {
    fun getComponent(): IApplicationComponent
}
//=====================================================================================================================
/*END-TASK*/