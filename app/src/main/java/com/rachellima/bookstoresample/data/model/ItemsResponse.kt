package com.rachellima.bookstoresample.data.model

import com.google.gson.annotations.SerializedName

data class ItemsResponse(
    @SerializedName("kind")
    val kind : String,
    @SerializedName("id")
    val id : String,
    @SerializedName("etag")
    val etag : String,
    @SerializedName("selfLink")
    val selfLink : String,
    @SerializedName("volumeInfo")
    val volumeInfoList : List<VolumeInfoResponse>,
    @SerializedName("publisher")
    val publisher : String,
    @SerializedName("publishedDate")
    val publishedDate : String,
    @SerializedName("description")
    val description : String,
    @SerializedName("industryIdentifiers")
    val industryIdentifiersList : List<IndustryIdentifiersResponse>,
    @SerializedName("readingModes")
    val readingModes : List<ReadingModesResponse>,
    @SerializedName("pageCount")
    val pageCount : Int,
    @SerializedName("printType")
    val printType : String,
    @SerializedName("categories")
    val categories : List<String>,
    @SerializedName("maturityRating")
    val maturityRating : String,
    @SerializedName("allowAnonLogging")
    val allowAnonLogging : Boolean,
    @SerializedName("contentVersion")
    val contentVersion : String,
    @SerializedName("imageLinks")
    val imageLinks : List<ImageLinks>,
)