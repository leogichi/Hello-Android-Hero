package com.helloandroidhero.herodetails.module

import com.helloandroidhero.herodetails.IHeroDetailsMvp
import com.helloandroidhero.herodetails.model.HeroDetailsIModel
import com.helloandroidhero.herodetails.presenter.HeroDetailsIPresenter
import dagger.Module
import dagger.Provides

@Module
class HeroDetailsModule {
    @Provides
    fun provideHeroDetailsPresenter(iModel: IHeroDetailsMvp.iModel): IHeroDetailsMvp.iPresenter {
        return HeroDetailsIPresenter()
    }

    @Provides
    fun provideHeroDetailsModel(): IHeroDetailsMvp.iModel {
        return HeroDetailsIModel()
    }
}