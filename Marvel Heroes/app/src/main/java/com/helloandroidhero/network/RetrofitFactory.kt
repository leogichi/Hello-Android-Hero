package com.helloandroidhero.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//=====================================================================================================================
class RetrofitFactory {
    companion object{

        val BASE_URL = "https://gateway.marvel.com:443"
        val API_KEY = "3cb1f248e76047ae59083590d937b8ca"
        val SECRET_KEY = "19916e3b4f783dbf400b3fb1132da35943898396"


        fun makeRetrofitService(): IRetrofitServices.iRetrofitGetHeroesService {
             return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(IRetrofitServices.iRetrofitGetHeroesService::class.java)
        }



    }

}
//=====================================================================================================================
/*END-TASK*/