package com.helloandroidhero.herolist

import com.helloandroidhero.herolist.model.body.HeroListBody
import com.helloandroidhero.herolist.model.body.JsonBody
import retrofit2.Response

interface IHeroListMvp {
    interface iModel{
        suspend fun getHeroListResponse():Response<JsonBody>?


    }
    interface iPresenter{
        fun setView(iView : iView)
        fun goHeroDetails()
        fun getResultsHeroList()
    }
    interface iView{
        fun goHeroDetails()
        fun setAdapter(darrHeroes: List<HeroListBody>)
    }
}