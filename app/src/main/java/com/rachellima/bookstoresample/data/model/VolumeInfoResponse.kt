package com.rachellima.bookstoresample.data.model

import com.google.gson.annotations.SerializedName

data class VolumeInfoResponse(
    @SerializedName("title")
    val title: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("authors")
    val authorsList : List<String>,
)