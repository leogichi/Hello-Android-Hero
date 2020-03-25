package com.helloandroidhero.herolist.model

import android.util.Log
import com.helloandroidhero.extensions.md5
import com.helloandroidhero.herolist.IHeroListMvp
import com.helloandroidhero.herolist.model.body.DataBody
import com.helloandroidhero.herolist.model.body.JsonBody
import com.helloandroidhero.network.RetrofitFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import java.net.SocketTimeoutException
//=====================================================================================================================
class HeroListIModel : IHeroListMvp.iModel {

    val service = RetrofitFactory.makeRetrofitService()

    val strTimeStamp = "1"

    var hash = strTimeStamp+ RetrofitFactory.SECRET_KEY + RetrofitFactory.API_KEY


    override suspend fun getHeroListResponse(): Response<JsonBody>? {

        return withContext(Dispatchers.IO) {
            var response:Response<JsonBody>?= null


            try {

                response =  service.getResultHeroList(
                    RetrofitFactory.API_KEY,strTimeStamp,hash.md5()
                ).execute()

            }catch (ex: SocketTimeoutException){
                Log.i("", ex.toString())
            }catch (ex1: Throwable){
                Log.i("", ex1.toString())

            }
            return@withContext response
        }
    }
}
//=====================================================================================================================
/*END-TASK*/
