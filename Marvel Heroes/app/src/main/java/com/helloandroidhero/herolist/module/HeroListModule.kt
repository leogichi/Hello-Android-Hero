package com.helloandroidhero.herolist.module
/*Task structure for use in app component*/
import com.helloandroidhero.herolist.IHeroListMvp
import com.helloandroidhero.herolist.model.HeroListIModel
import com.helloandroidhero.herolist.presenter.HeroListIPresenter
import dagger.Module
import dagger.Provides
//=====================================================================================================================
@Module
class HeroListModule {
    @Provides
    fun provideHeroListPresenter(iModel: IHeroListMvp.iModel): IHeroListMvp.iPresenter {
        return HeroListIPresenter(iModel)
    }

    @Provides
    fun provideHeroListModel():IHeroListMvp.iModel {
        return HeroListIModel()
    }
}
//=====================================================================================================================
/*END-TASK*/