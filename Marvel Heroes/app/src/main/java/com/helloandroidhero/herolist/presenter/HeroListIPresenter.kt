package com.helloandroidhero.herolist.presenter

import com.helloandroidhero.herolist.IHeroListMvp
import com.helloandroidhero.herolist.model.body.DataBody
import com.helloandroidhero.herolist.model.body.JsonBody
import kotlinx.coroutines.*
import retrofit2.Response
import kotlin.coroutines.CoroutineContext
//=====================================================================================================================

class HeroListIPresenter(val iModel: IHeroListMvp.iModel) : IHeroListMvp.iPresenter , CoroutineScope {

    /*Instance Variables*/
    //------------------------------------------------------------------------------------------------------------------
    private val job: Job = Job()




    /*MVP Variables*/
    //------------------------------------------------------------------------------------------------------------------
    private lateinit var iView: IHeroListMvp.iView


    //                                                     //Start Coroutine
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.IO


    override fun setView(iView: IHeroListMvp.iView) {
        this.iView = iView
    }

    override fun goHeroDetails() {

    }



    override fun getResultsHeroList() {
        GlobalScope.launch {
            withContext(Dispatchers.Main) {
                tryGetResultsHeroList()
            }
        }
    }

    suspend fun tryGetResultsHeroList(){

        var results = iModel.getHeroListResponse()
        iView.setAdapter((results!!.body() as JsonBody).dataBody!!.darHeroListBody!!)

    }

}
//=====================================================================================================================
