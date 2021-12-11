package com.rachellima.bookstoresample.data.model

import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName("kind")
    val kind : String,
    @SerializedName("totalItems")
    val totalItems : Int,
    @SerializedName("items")
    val itemsList : List<ItemsResponse>
)