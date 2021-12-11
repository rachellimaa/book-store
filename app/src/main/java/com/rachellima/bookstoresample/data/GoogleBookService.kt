package com.rachellima.bookstoresample.data

import retrofit2.http.GET

interface GoogleBookService {
    @GET("volumes?q=ios&maxResults=20&startIndex=0")
    fun getBooks()
}