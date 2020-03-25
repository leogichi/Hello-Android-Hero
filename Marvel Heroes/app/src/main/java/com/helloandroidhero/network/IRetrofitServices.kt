package com.helloandroidhero.network

import com.helloandroidhero.herolist.model.body.JsonBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface IRetrofitServices {

    interface iRetrofitGetHeroesService{
        @Headers("Content-Type: application/json")
        @GET("/v1/public/characters")
        fun getResultHeroList(
            @Query("apikey")strApikey:String,
            @Query("ts")strTimeStamp:String,
            @Query("hash") strHash:String):
                Call<JsonBody>
    }
}