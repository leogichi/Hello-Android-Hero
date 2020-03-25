package com.helloandroidhero.herolist.model.body

import com.google.gson.annotations.SerializedName

class JsonBody() {
    @SerializedName("data")
    var dataBody :DataBody?  = null
    constructor(
        dataBody: DataBody? = null
    ):this(){
        this.dataBody = dataBody
    }
}