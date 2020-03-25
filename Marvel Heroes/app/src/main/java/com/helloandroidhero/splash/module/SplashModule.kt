package com.helloandroidhero.splash.module

import com.helloandroidhero.herolist.IHeroListMvp
import com.helloandroidhero.herolist.presenter.HeroListIPresenter
import com.helloandroidhero.splash.ISplashMvp
import com.helloandroidhero.splash.presenter.SplashIPresenter
import dagger.Module
import dagger.Provides


//=====================================================================================================================
@Module
class SplashModule {
    @Provides
    fun provideSplashPresenter(iModel: ISplashMvp.iModel): ISplashMvp.iPresenter {
        return SplashIPresenter(iModel)
    }

}
//=====================================================================================================================
/*END-TASK*/