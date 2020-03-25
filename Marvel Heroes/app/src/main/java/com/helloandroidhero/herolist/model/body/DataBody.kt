package com.helloandroidhero.herolist.model.body

import com.google.gson.annotations.SerializedName

class DataBody() {

    @SerializedName("results")
    var darHeroListBody :List<HeroListBody>? = null

    constructor(
        darHeroListBody: List<HeroListBody>? = null
    ):this(){
        this.darHeroListBody = darHeroListBody

    }
}