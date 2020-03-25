package com.helloandroidhero.herolist.model.body

import com.google.gson.annotations.SerializedName

//=====================================================================================================================
class HeroListBody() {
    /*Instance Variables*/
    //----------------------------------------------------------------------------------------------------------------
    //                                                     //Contain the body for reponse
    @SerializedName("id")
    var strId: String? = null
    @SerializedName("name")
    var strName: String? = null
    @SerializedName("thumbnail")
    var thumbnail: ThumbnailBody? = null

    /*Constructors*/
    //------------------------------------------------------------------------------------------------------------------
    constructor(
        strId: String,
        strName: String,
        thumbnail: ThumbnailBody
    ) : this() {
        this.strId = strId
        this.strName = strName
        this.thumbnail = thumbnail
    }
}
//=====================================================================================================================
/*END-TASK*/