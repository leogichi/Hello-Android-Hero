package com.helloandroidhero.root

import com.helloandroidhero.herolist.view.HeroListFragment
import com.helloandroidhero.herodetails.view.HeroDetailFragment
import com.helloandroidhero.splash.view.SplashFragment
import dagger.Component
import javax.inject.Singleton

//=====================================================================================================================
@Singleton
@Component(modules = [ApplicationModule::class])
interface IApplicationComponent{
    fun inject(target: HeroListFragment)
    fun inject(target: SplashFragment)
    fun inject(target: HeroDetailFragment)
}

//=====================================================================================================================
/*END-TASK*/