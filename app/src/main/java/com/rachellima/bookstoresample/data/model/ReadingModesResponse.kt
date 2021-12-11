package com.rachellima.bookstoresample.data.model

import com.google.gson.annotations.SerializedName

data class ReadingModesResponse(
    @SerializedName("text")
    val text: String,
    @SerializedName("image")
    val image: String,
)