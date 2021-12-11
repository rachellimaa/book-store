package com.rachellima.bookstoresample.data.model

import com.google.gson.annotations.SerializedName

data class IndustryIdentifiersResponse(
    @SerializedName("type")
    val type : String,
    @SerializedName("identifier")
    val identifier : String,
)
