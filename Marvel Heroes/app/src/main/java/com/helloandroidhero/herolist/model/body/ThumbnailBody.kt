package com.helloandroidhero.herolist.model.body

import com.google.gson.annotations.SerializedName

class ThumbnailBody() {
    @SerializedName("path")
    var strPath:String? = null

    constructor(
        strPath:String
    ):this(){
        this.strPath = strPath
    }
}